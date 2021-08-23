import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {EmployeelistComponent} from "./Employee/employeelist/employeelist.component";
import {EmployeeUpdateComponent} from "./Employee/employee-update/employee-update.component";

const routes: Routes = [
  {
    component:EmployeelistComponent, path : 'list'
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
