import {Component, Input, OnInit} from '@angular/core';
import {IStudent} from "../model/IStudent";

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  students: IStudent[] = null;
  parentStudentDetail: IStudent;
  constructor() { }

  ngOnInit(): void {

  }

  getStudent(value){
    this.parentStudentDetail =value;
  }
  catchMarkFromChilrent(value){

  }
}
