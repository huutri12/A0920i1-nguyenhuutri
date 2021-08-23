import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { EmployeeDeleteComponent } from './employee-delete/employee-delete.component';
import { EmployeeUpdateComponent } from './employee-update/employee-update.component';
import {NgxPaginationModule} from "ngx-pagination";

@NgModule({
  declarations: [
    AppComponent,
    EmployeeListComponent,
    EmployeeDeleteComponent,
    EmployeeUpdateComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        NgxPaginationModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
