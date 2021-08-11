import { Injectable } from '@angular/core';
import {Customer} from '../../src/app/model/customer';
import {CustomerType} from '../../src/app/model/customer-type';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private readonly API_CUSTOMER_URL = 'http://localhost:3000/customers';
  private readonly API_CUSTOMERTYPE_URL = 'http://localhost:3000/customerType';

  constructor(private httpClient: HttpClient) {
  }

  public getCustomer(): Observable<Customer[]> {
    return this.httpClient.get<Customer[]>(this.API_CUSTOMER_URL);
  }

  public getCustomerType(): Observable<CustomerType[]> {
    return this.httpClient.get<CustomerType[]>(this.API_CUSTOMERTYPE_URL);
  }

  public addCustomer(customer: Customer): Observable<void> {
    return this.httpClient.post<void>(this.API_CUSTOMER_URL, customer);
  }

  public findCustomerById(id: number): Observable<Customer> {
    return this.httpClient.get<Customer>(this.API_CUSTOMER_URL + '/' + (id));
  }

  public updateCustomer(updateCustomer: Customer): Observable<void> {
    return this.httpClient.put<void>(this.API_CUSTOMER_URL + '/' + updateCustomer.id, updateCustomer);
  }



  public deleteCustomer(id) {
    console.log(id);
    console.log(this.API_CUSTOMER_URL + '/' + id);
    return this.httpClient.delete(this.API_CUSTOMER_URL + '/' + id);
  }
}
