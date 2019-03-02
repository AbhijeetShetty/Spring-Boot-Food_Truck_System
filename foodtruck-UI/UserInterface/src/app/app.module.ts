import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { ContactComponent } from './contact/contact.component';
import {Router, Routes, RouterModule} from "@angular/router";
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
    component: RegisterComponent,
    pathMatch:'full'
  },
  {
    path:'**',
    component: NotFoundComponent
  }

]

@NgModule({
  declarations: [
    AppComponent,
    NotFoundComponent,
    RegisterComponent,
    LoginComponent,
    ContactComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes),
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
