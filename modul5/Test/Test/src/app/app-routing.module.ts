import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {EmployeeListComponent} from "./employee-list/employee-list.component";
import {EmployeeUpdateComponent} from "./employee-update/employee-update.component";

const routes: Routes = [
  {
    component:EmployeeListComponent, path : 'list'
  },
  {
    component:EmployeeUpdateComponent, path : 'update/:id'
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
