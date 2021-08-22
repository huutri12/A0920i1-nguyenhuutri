import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {EmployeeService} from "../model/employee.service";
import {Employee} from "../model/employee";
import {EmployeeType} from "../model/employee-type";

@Component({
  selector: 'app-employee-form',
  templateUrl: './employee-form.component.html',
  styleUrls: ['./employee-form.component.css']
})
export class EmployeeFormComponent{

  employees: Employee;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private employeeService: EmployeeService) {
    // @ts-ignore
    this.employees = new Employee();
  }

  onSubmit() {
    this.employeeService.save(this.employees).subscribe(result => this.gotoUserList());
  }

  gotoUserList() {
    this.router.navigate(['/employees']);
  }

}
