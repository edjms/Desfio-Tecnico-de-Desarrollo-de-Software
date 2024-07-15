import { Component, EventEmitter, Output } from '@angular/core';
import { ClientService } from '../../services/client.service';
import { format } from 'date-fns';

@Component({
  selector: 'app-create-client',
  templateUrl: './create-client.component.html',
  styleUrl: './create-client.component.css'
})
export class CreateClientComponent {
  @Output() close = new EventEmitter<void>();
  client = {
    name: '',
    email: '',
    phone: '',
    startDate: '',
    endDate: '',
    sharedKey: ''
  };
  constructor(private clientService: ClientService) { }



  createUser(): void {
    this.client.startDate = format(this.client.startDate, 'dd/MM/yyyy');
    this.client.endDate = format(this.client.endDate, 'dd/MM/yyyy');
    this.clientService.createClient(this.client).subscribe({
      next: () => {
        console.log('Cliente creado exitosamente');
        this.closeCreateUserComponent();
      },
      error: (error: any) => {
        console.error('Error al crear el cliente', error);
      }
    });
  }
    
  closeCreateUserComponent(): void {
    this.close.emit();
  }


}
