import { Component, OnInit } from '@angular/core';
import {CustomerService} from '../../../../service/customer/customer.service';
import {Router} from '@angular/router';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {showWarningOnce} from 'tslint/lib/error';
import {CustomerType} from '../../model/customer-type';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  customerTypeList : CustomerType[];

  constructor(private customer: CustomerService,
              private router: Router) {
  }
  public maxDate = new Date();
  public minDate = new Date(1900, 1,1)

  createCustomer = new FormGroup({
    id: new FormControl('',[Validators.required]),
    customerType:new FormControl('',[Validators.required]),
    name:new FormControl('',[Validators.required]),
    birthDate:new FormControl('',[Validators.required]),
    gender:new FormControl('',[Validators.required]),
    idCard:new FormControl('',[Validators.required]),
    phone:new FormControl('',[Validators.required]),
    email:new FormControl('',[Validators.required]),
    address:new FormControl('',[Validators.required]),
    }

  )

  ngOnInit(): void {
    this.getAllCustomerTypeList();
  }
  getAllCustomerTypeList(){
    this.customer.getCustomerType().subscribe((data )=> {
      console.log(data);
    this.customerTypeList = data;
    });

  }

  addCustomer() {
    this.customer.addCustomer(this.createCustomer.value).subscribe((data)=>{
      this.router.navigateByUrl('list');
      alert("Done!")
    }, error => console.log(error))
  }
}
