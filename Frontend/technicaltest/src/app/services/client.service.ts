import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, catchError,throwError} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClientService {

  private apiUrl = 'http://localhost:8080/api/client'; 

  constructor(private http: HttpClient) { }

  FindAllClient(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/list`)
      .pipe(
        catchError((error: any) => {
          console.error('Error al obtener clientes:', error);
          throw error; // Propaga el error
        })
      );
      }

      getClientById(id: String): Observable<any> { 
        return this.http.get<any>(`${this.apiUrl}/list/${id}`)
        .pipe(
         catchError((error: any) => {
           console.error('Error al obtener clientes:', error);
           throw error; 
         }) 
       );
      }


      createClient(client: any): Observable<any> {
        const headers = new HttpHeaders({ 'Content-Type': 'application/json' });
        return this.http.post<any>(`${this.apiUrl}/create`, client,{headers}).pipe(
          catchError((error: (arg0: any) => any) => {
            console.error('Error al crear cliente:', error);
            throw error(error);
          })
        );
      }
}

