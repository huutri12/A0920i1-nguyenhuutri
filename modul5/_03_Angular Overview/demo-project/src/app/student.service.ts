import { Injectable } from '@angular/core';
import {IStudent} from "./model/IStudent";

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor() { }
  getAllStudent(){
    return null;
  }
  addNewStudent(student: IStudent){
    null;
  }
}
