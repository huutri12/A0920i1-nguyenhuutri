import { Component, OnInit } from '@angular/core';
import {IStudent} from "../model/IStudent";

@Component({ //Các thành phần đánh dấu bằng @ được gọi là decorator, tương đương với annotation trong spring
  selector: 'app-student-information',
  templateUrl: './student-information.component.html'

})
export class StudentInformationComponent implements OnInit {


  student: IStudent = {
    id: 1,
    name: "tri",
    age: 20,
    mark: 8,
    avatar: "https://thumbs.dreamstime.com/z/call-center-icon-vector-male-data-support-customer-service-person-profile-avatar-headphone-line-graph-online-153587667.jpg",
  }
  constructor() { }

  ngOnInit(): void {
  }
  changeMarkForStudent(mark: number){
    this.student.mark= mark;
  }

}
