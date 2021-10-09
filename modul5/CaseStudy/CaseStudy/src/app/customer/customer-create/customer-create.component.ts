import { Component, OnInit } from '@angular/core';
import {CustomerService} from '../../../../service/customer/customer.service';
import {Router} from '@angular/router';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {CustomerType} from '../../model/customer-type';
import {MatSnackBar} from '@angular/material/snack-bar';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  customerTypeList : CustomerType[];

  constructor(private customer: CustomerService,
              private router: Router,
              public snackBar: MatSnackBar) {
  }
  public maxDate = new Date();
  public minDate = new Date(1900, 1,1)

  createCustomer = new FormGroup({
    /*id: new FormControl('',[Validators.required]),*/
    customerType:new FormControl('',[Validators.required]),
    name:new FormControl('',[Validators.required,Validators.minLength(3)]),
    birthDate:new FormControl('',[Validators.required]),
    gender:new FormControl('',[Validators.required]),
    idCard:new FormControl('',[Validators.required, Validators.pattern('^[0-9]{10}$')]),
    phone:new FormControl('',[Validators.required,Validators.pattern('^(\\+?\d{1,4}[\s-])?(?!0+\s+,?$)\\d{10}\s*,?$')]),
    email:new FormControl('',[Validators.required,Validators.pattern('[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$')]),
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
      this.snackBar.open("Create successfully!", "Done");
    }, error => console.log(error))
  }
}
