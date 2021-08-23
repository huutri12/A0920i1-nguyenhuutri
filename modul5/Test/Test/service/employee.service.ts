import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Employee} from "../model/employee";
import {MaEmployee} from "../model/ma-employee";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private readonly API_EMPLOYEE_URL = 'http://localhost:3000/customers';
  private readonly API_MAEMPLOYEE_URL = 'http://localhost:3000/customerType';

  constructor(private httpClient: HttpClient) {
  }

  public getEmployee(): Observable<Employee[]> {
    return this.httpClient.get<Employee[]>(this.API_EMPLOYEE_URL);
  }

  public getMaEmployee(): Observable<MaEmployee[]> {
    return this.httpClient.get<MaEmployee[]>(this.API_MAEMPLOYEE_URL);
  }


  public findEmployeeById(id: number): Observable<Employee> {
    return this.httpClient.get<Employee>(this.API_EMPLOYEE_URL + '/' + (id));
  }

  public update_employee(updateEmployee: Employee): Observable<void> {
    return this.httpClient.put<void>(this.API_EMPLOYEE_URL + '/' + updateEmployee.id, updateEmployee);
  }



  /*public deleteEmployee(id) {
    console.log(id);
    console.log(this.API_EMPLOYEE_URL + '/' + id);
    return this.httpClient.delete(this.API_EMPLOYEE_URL + '/' + id);
  }*/
}
