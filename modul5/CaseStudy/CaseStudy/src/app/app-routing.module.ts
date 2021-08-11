import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CustomerCreateComponent} from './customer/customer-create/customer-create.component';
import {CustomerUpdateComponent} from './customer/customer-update/customer-update.component';
import {CustomerListComponent} from './customer/customer-list/customer-list.component';


const routes: Routes = [
  {
    component:CustomerListComponent, path : 'list'
  },
  {
    component:CustomerUpdateComponent, path : 'update/:id'
  },
  {
    component:CustomerCreateComponent, path : 'add'
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
