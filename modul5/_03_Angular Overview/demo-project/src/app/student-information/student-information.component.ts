import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {IStudent} from "../model/IStudent";
import {StudentService} from "../student.service";
import {ActivatedRoute} from "@angular/router";

@Component({ //Các thành phần đánh dấu bằng @ được gọi là decorator, tương đương với annotation trong spring
  selector: 'app-student-information',
  templateUrl: './student-information.component.html'

})
export class StudentInformationComponent implements OnInit {
  idStudent;
  studentsDe
  childStudentDetail:IStudent;
  constructor(private studentService: StudentService,
              private activatedRoute: ActivatedRoute) { }
  //khai bao 1 su kien
  throwCurentMark = new EventEmitter();
  ngOnInit(): void {
  }


  changeMarkForStudent(value: any) {

  }
}
