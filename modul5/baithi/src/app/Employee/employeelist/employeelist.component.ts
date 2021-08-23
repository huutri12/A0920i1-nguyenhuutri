import { Component, OnInit } from '@angular/core';
import {EmployeeService} from "../../../../service/employee.service";
import {MatDialog} from "@angular/material/dialog";
import {Employee} from "../../model/employee";
import {EmployeeDeleteComponent} from "../employee-delete/employee-delete.component";


@Component({
  selector: 'app-employeelist',
  templateUrl: './employeelist.component.html',
  styleUrls: ['./employeelist.component.css']
})
export class EmployeelistComponent implements OnInit {
  employees: Employee[] | undefined;
  p:number =1;
  firstName:any;
  constructor(
    private employeeService: EmployeeService,
    public dialog:MatDialog
  ) { }

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
  Search(){
    if (this.firstName == ""){
      this.ngOnInit();
    }else {
      // @ts-ignore
      this.employees = this.employees.filter(res => {
        return res.ten.toLocaleLowerCase().match(this.firstName.toLocaleLowerCase());
      })
    }
  }


}
