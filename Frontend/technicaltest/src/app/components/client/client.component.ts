import { Component, OnInit } from '@angular/core';
import { ClientService } from '../../services/client.service';
@Component({
  selector: 'app-client',
  templateUrl: './client.component.html',
  styleUrl: './client.component.css'
})
export class ClientComponent implements OnInit {
  clientes: any[] = [];
  searchId: string = '';
  showCreateUser: boolean = false;

  constructor(private clientService:ClientService) { }

  ngOnInit(): void {
    this.findAllClientes();
  }

  findAllClientes(): void {
    this.clientService.FindAllClient().subscribe({
      next: (data: any[]) => {
        this.clientes = data;
      },
      error: (error) => {
        console.error('Error al obtener clientes', error);
      },
      complete: () => {
        console.log('La operación de obtener clientes ha finalizado.');
      }
    });
  }

    searchClient(): void {
      if (this.searchId) {
        this.clientService.getClientById(this.searchId).subscribe({
          next: (data: any) => {
            this.clientes = [data];
          },
          error: (error) => {
            console.error('Error al obtener el cliente', error);
          }
        });
      } else {
        this.findAllClientes();
      }
    }

    
  openCreateUserComponent(): void {
    this.showCreateUser = true; 
  }

  onCreateUserClosed(): void {
    this.showCreateUser = false; 
    this.findAllClientes(); 
  }

}
