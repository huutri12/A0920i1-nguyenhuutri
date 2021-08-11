import { Component } from '@angular/core';
import {MatSnackBar} from '@angular/material/snack-bar';

/*class NotificationService {
  notification$: any;

}*/

@Component({

  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'CaseStudy';
/*constructor( private notificationService: NotificationService, private snackBar: MatSnackBar
) {
  this.notificationService.notification$.subscribe(message => {
    this.snackBar.open(message);
  });
}*/
  constructor() {
  }
}
