import { Component, OnInit } from '@angular/core';
import {Employee} from "../../../model/employee";
import {EmployeeService} from "../../../service/employee.service";
import {MatDialog} from "@angular/material/dialog";
import {EmployeeDeleteComponent} from "../employee-delete/employee-delete.component";

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  employees: Employee[];
  p:number =1;
  constructor( private employeeService: EmployeeService,
               public dialog:MatDialog) { }

  ngOnInit(): void {
    this.employeeService.getEmployee().subscribe(
      (data ) =>{
        console.log(data);
        this.employees = data;
      }
    )
  }
  openDialogDelete(id:number){
    const dialogRef = this.dialog.open(EmployeeDeleteComponent,
      {data: {
          id
        },
        width: '400px',
        disableClose: true,
        panelClass: 'custom-modalbox'
      });
    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
      this.ngOnInit();

    });
  }
}
