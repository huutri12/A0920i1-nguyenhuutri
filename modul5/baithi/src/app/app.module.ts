import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {FormsModule} from '@angular/forms';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatTableModule} from '@angular/material/table';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatButtonModule} from '@angular/material/button';
import {MatNativeDateModule} from '@angular/material/core';
import {NgxPaginationModule, PaginatePipe} from 'ngx-pagination';
import {Ng2OrderModule, Ng2OrderPipe} from 'ng2-order-pipe';
import {Ng2SearchPipe, Ng2SearchPipeModule} from 'ng2-search-filter';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import { EmployeelistComponent } from './Employee/employeelist/employeelist.component';
import { EmployeeUpdateComponent } from './Employee/employee-update/employee-update.component';
import { EmployeeDeleteComponent } from './Employee/employee-delete/employee-delete.component';
import { NarbarComponent } from './narbar/narbar.component';
import { FooterComponent } from './footer/footer.component';
import {MatDialogModule} from "@angular/material/dialog";

@NgModule({
  declarations: [
    AppComponent,
    EmployeelistComponent,
    EmployeeUpdateComponent,
    EmployeeDeleteComponent,
    NarbarComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    FormsModule,
    MatTableModule,
    MatDatepickerModule,
    MatButtonModule,
    MatFormFieldModule,
    MatNativeDateModule,
    NgxPaginationModule,
    Ng2OrderModule,
    Ng2SearchPipeModule,
    MatSnackBarModule,
    MatDialogModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
