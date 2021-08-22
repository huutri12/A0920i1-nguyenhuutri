import {EmployeeType} from "./employee-type";

export class Employee {
  id : number;
  name : string;
  email:string;
  employeeType:EmployeeType;
  imageUrl : string;


  constructor(id: number, name: string, email: string, employeeType: EmployeeType, imageUrl: string) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.employeeType = employeeType;
    this.imageUrl = imageUrl;
  }
}
