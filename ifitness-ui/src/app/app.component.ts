import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

import { ButtonModule } from 'primeng/button';
import { TableModule } from 'primeng/table';
import { TooltipModule } from 'primeng/tooltip';
import { ActivitiesListComponent } from './activities/activities-list/activities-list.component';
import { LoginFormComponent } from './security/login-form/login-form.component';
import { HttpClientModule } from '@angular/common/http';
import { AuthService } from './security/auth.service';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    RouterOutlet,
ActivitiesListComponent,
LoginFormComponent,
 HttpClientModule
  ],
   providers: [
    AuthService
   ],


  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'ifitness-ui';


}
