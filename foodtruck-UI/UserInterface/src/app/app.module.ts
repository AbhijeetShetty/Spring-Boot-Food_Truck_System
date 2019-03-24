import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


import { AlertService } from './services/alert-service';
import { UserService } from './services/user-service';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { RegisterComponent } from './components/register/register.component';
import { LoginComponent } from './components/login/login.component';
import { ContactComponent } from './components/contact/contact.component';
import {Router, Routes, RouterModule} from "@angular/router";
import { HomeComponent } from './components/home/home.component';
const appRoutes : Routes = [
  {
    path : 'register',
    component: RegisterComponent
  },
  {
    path:'contact',
    component: ContactComponent
  },
  {
    path:'login',
    component: LoginComponent
  },
  {
    path:'',
    component: HomeComponent,
    pathMatch:'full'
  },
  {
    path:'**',
    component: NotFoundComponent
  },
  {
    path:'home',
    component: HomeComponent
  }

]

@NgModule({
  declarations: [
    AppComponent,
    NotFoundComponent,
    RegisterComponent,
    LoginComponent,
    ContactComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(appRoutes),
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [AlertService,UserService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
