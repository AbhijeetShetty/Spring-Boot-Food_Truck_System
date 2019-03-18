import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule }   from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { ContactComponent } from './contact/contact.component';
import {Router, Routes, RouterModule} from "@angular/router";
import { HomeComponent } from './home/home.component';
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
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
