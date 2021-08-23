import {Component, Inject, OnInit} from '@angular/core';
import {EmployeeService} from "../../../../service/employee.service";
import {MAT_DIALOG_DATA} from "@angular/material/dialog";
import {Router} from "@angular/router";
import {MatSnackBar} from "@angular/material/snack-bar";

@Component({
  selector: 'app-employee-delete',
  templateUrl: './employee-delete.component.html',
  styleUrls: ['./employee-delete.component.css']
})
export class EmployeeDeleteComponent implements OnInit {
  id: number;
  name: string;
  constructor( private employeeService: EmployeeService, private router: Router,
               @Inject(MAT_DIALOG_DATA) public data: any,
               public snackBar: MatSnackBar) {
    this.id = data.id;
    this.name = data.name;
  }
  ngOnInit(): void {
  }
  onSubmit(id: number) {
    console.log(id);
    this.employeeService.deleteEmployee(id).subscribe(
      (data) => {
        this.router.navigate(['list']);
        this.snackBar.open("Delete successfully!", "Done");
      }, error => console.log(error)

    );
  }

}
