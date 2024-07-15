import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ClientComponent} from './components/client/client.component';
import { CreateClientComponent } from './components/create-client/create-client.component';

const routes: Routes = [
  
     { path: 'client', component: ClientComponent },
     {path: 'createclient', component:CreateClientComponent}
   
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
