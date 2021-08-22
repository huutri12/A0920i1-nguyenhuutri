import { Component, OnInit } from '@angular/core';
import {Customer} from '../../model/customer';
import {CustomerService} from '../../../../service/customer/customer.service';
import {CustomerDeleteComponent} from '../customer-delete/customer-delete.component';
import {MatDialog} from '@angular/material/dialog';
import {CustomerUpdateComponent} from '../customer-update/customer-update.component';
import {Router} from '@angular/router';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customers: Customer[];
  p:number =1;
  firstName:any;
  constructor(
    private customerService: CustomerService,
    public dialog: MatDialog
  ) { }

  ngOnInit(): void {
    this.customerService.getCustomer().subscribe(
      (data) =>{
        console.log(data);
        this.customers = data;
      }
    )
  }
  openDialogDelete(id: number) {
    const dialogRef = this.dialog.open(CustomerDeleteComponent,
      {data: {
          id
        },
        width: '400px',
        disableClose: true,
        panelClass: 'custom-modalbox'
      });
    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
      this.ngOnInit();

    });
  }

  Search(){
    if (this.firstName == ""){
      this.ngOnInit();
    }else {
      this.customers = this.customers.filter(res => {
        return res.name.toLocaleLowerCase().match(this.firstName.toLocaleLowerCase());
      })
    }
  }
  key:string = 'id';
  reverse:boolean = false;
  sort(key){
    this.key = key;
    this.reverse = !this.reverse;
  }

}
