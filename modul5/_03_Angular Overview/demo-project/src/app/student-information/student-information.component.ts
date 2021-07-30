import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {IStudent} from "../model/IStudent";

@Component({ //Các thành phần đánh dấu bằng @ được gọi là decorator, tương đương với annotation trong spring
  selector: 'app-student-information',
  templateUrl: './student-information.component.html'

})
export class StudentInformationComponent implements OnInit {
  @Input()
  childStudentDetail:IStudent;
  constructor() { }
  @Output()
  //khai bao 1 su kien
  throwCurentMark = new EventEmitter();
  ngOnInit(): void {
  }
   changeMarkForStudent(mark: number){
    //this.student.mark= mark;
     this.childStudentDetail.mark = mark;
     this.throwCurentMark.emit(mark);
  }

}
