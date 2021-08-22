import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {CustomerService} from '../../../../service/customer/customer.service';
import {ActivatedRoute, Router} from '@angular/router';
import {CustomerType} from '../../model/customer-type';
import {MatSnackBar} from '@angular/material/snack-bar';


@Component({
  selector: 'app-customer-update',
  templateUrl: './customer-update.component.html',
  styleUrls: ['./customer-update.component.css']
})
export class CustomerUpdateComponent implements OnInit {
  customerTypeList: CustomerType[];

  customers:any[];

  alert:boolean = false;

  public maxDate = new Date();
  public minDate = new Date(1900, 1,1)
  editCustomer = new FormGroup({
    id: new FormControl('',[Validators.required]),
    customerType:new FormControl('',[Validators.required]),
    name:new FormControl('',[Validators.required,Validators.minLength(3)]),
    birthDate:new FormControl('',[Validators.required]),
    gender:new FormControl('',[Validators.required]),
    idCard:new FormControl('',[Validators.required, Validators.pattern('^[0-9]{10}$')]),
    phone:new FormControl('',[Validators.required,Validators.pattern('^(\\+?\d{1,4}[\s-])?(?!0+\s+,?$)\\d{10}\s*,?$')]),
    email:new FormControl('',[Validators.required,Validators.pattern('[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$')]),
    address:new FormControl('',[Validators.required]),
  })
  constructor(
    private customer: CustomerService,
    private router: ActivatedRoute,
    private route: Router,
    public snackBar: MatSnackBar
  ) { }

  ngOnInit(): void {
    this.getAllCustomerType();

    console.log(this.router.snapshot.params.id);
    this.customer.findCustomerById(this.router.snapshot.params.id).subscribe((result) => {
      console.log(result);
      this.editCustomer.setValue(result);
      console.log(this.editCustomer);
    })
  }

  updateCustomer(){
    this.customer.updateCustomer(this.router.snapshot.params.id).subscribe((result) => {
      console.log(result, 'data update success');
      this.route.navigateByUrl('list')
    })
  }

  getAllCustomerType(){
    this.customer.getCustomerType().subscribe((data) => {
      this.customerTypeList = data;
    },error => console.log(error));
  }

  onSubmit(updateForm: FormGroup) {
    this.customer.updateCustomer(updateForm.value).subscribe(
      (data) => {
        this.route.navigateByUrl('list');
        this.snackBar.open("Update successfully!", "Done");
      }, error => console.log(error)
    );
  }
}
