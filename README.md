# GUIBASED_Electricity_Billing_Application
Developed the GUI based Application by using  Swing, AWT framework on netbeans and with the help of database connectivity -SQL

-> Because of a few issues, electricity customers frequently deal with inaccurate and delayed monthly billing. Therefore, having a reliable system via an electronic platform for such purposes while taking proximity into account is crucial.

-> The suggested solution automates the cumbersome and time-consuming process of paying a power bill by visiting the power board. For the convenience of the user, it is also designed to automate the computation and payment of electricity bills. Java Swings, a foundational programming language for creating websites, online applications, and web services, is used to create the system.

-> Back-end databases are also created using the Microsoft Structured Query Language (SQL) server. There would be two logins for the system: an administrator login and a user login. The administrator has access to the user's account information and may also add the customer's information on energy use for the current month.

-> The administrator is responsible for entering each user's account's electricity usage data into the system. The system then determines each user's monthly electricity bill and updates the data in each user's account. Once the electricity bill is displayed, users can pay it before the month is out.

-----------------------------------------------------------------------------------------------------------------------------------------------------------

PROJECT OUTLINE:

A software-based application is the electricity billing system.
i. By automating the billing system, this project hopes to assist the Department of Electricity.
ii. It primarily focuses on the computation of units utilized within the designated time and the amount that the electricity offices will bill.
iii. This computerized system will simplify the billing process, making it more user-friendly, convenient, and efficient for customers.
The project has adopted the following features to make the billing system more user-friendly and service-oriented: The program performs with correctness and efficiency at a high rate of speed.

->The software offers the ability to share data, and unlike a traditional system, it doesn't require any people. It includes the feature of security restriction, and once put on the system, the client can examine all details, but the admin must only provide the meter readings.
The software used for power billing computes the customer's use of units and generates bills; installation and operation only require a small amount of storage. If an issue arises with the system, debugging is possible.

->The system eliminates the need to maintain paper electricity bills, frees the administrator from manually keeping track of users, and allows customers to make payments without having to come into the office. It thereby conserves resources and labor.

----------------------------------------------------------------------------------------------------------------------------------------------------------
OBJECTIVE OF MY PROJECT:

To save the month's consumption of energy information.

To preserve customer information.

To preserve data about the previous month's energy consumption per unit.

To consistently calculate the units consumed each month.

To create the bills by adding the fine and the rent.
To save time by introducing an online payment system.

-----------------------------------------------------------------------------------------------------------------------------------------------------------
PROBLEM STATEMENT:

There are some issues with the manual system. The procedure of keeping and maintaining the information is quite time-consuming and laborious for the consumer because all of the bills must be managed manually. It is an extremely arduous and time-consuming method because staff members must go to the clients' homes each month to deliver bills and collect money. Due to this, we have included features. Although the current system is computerized and only partially automated, it is still rather arduous because the same information must be entered multiple times.

-----------------------------------------------------------------------------------------------------------------------------------------------------------
Solution:

-> Because all electricity bill records are kept online, this project solution does not require retaining paper electricity bills.
-> The administrator is relieved of the burden of manually tracking all users. The penalty is calculated automatically by the system.
-> No delivery boy is required to deliver invoices to the user's home.
-> Users don't need to go to the office to pay their bills.
-> As a result, it conserves resources and human labor.

-----------------------------------------------------------------------------------------------------------------------------------------------------------
Project Working Procedure:

***** ADMIN *****

Login:

-> This program will allow the admin to enter the username and password.

-> If the entered credentials are correct, then the login will be successful otherwise need to be signup.

-> After successful login the admin will be redirected to admin portal page where he/she can do following activities.


1. New Customer:
-> This program will allow the admin to enter the customer details and automatically generates unique meter number.
-> If customer name, address, city, state, email and phone number is entered, insert the values into customer else print error while next=true ,enter the meter_info details else print meter_info error
-> Submit the details of customer that has been entered by clicking onto next button.
-> If we need to cancel the particulars that has been entered click onto cancel option.
-> If we need to submit the particulars that has been entered click onto submit option.

2. Customer Details:
-> This program will allow the admin to view customer details.
-> If we need to print the particulars that has been viewed click onto print option.

3. Deposit Details:
-> This program will allow the admin to view bill details. If we need to sort the particulars based on meter_no and month.
-> If we need to search the particulars that has been viewed click onto search option.
-> If we need to print the particulars that has been viewed click onto print option.

4. Tax Details:
-> This program will allow the admin to add tax details. insert the values into tax, else print error
-> Submit the details of tax that has been entered by clicking onto submit button.
-> If we need to cancel the particulars that has been entered click onto canceloption.

5. Calculate Bill:
-> This program will allow the admin to calculate total_bill when units consumed are inserted where meter_no and month is selected.
-> Insert the values into bill ,else print error
-> Submit the details of tax that has been entered by clicking onto submit button.
-> If we need to cancel the particulars that has been entered click onto cancel option.


***** USER *****

Login:

-> This program will allow the customer to enter the username and password. If the entered credentials are correct, then the login will be successful 
otherwise need to be signup with the meter_no which is given by admin. After successful login the customer will be redirected to customer portal page where he/she can do following activities.


1. Update Information:
-> This program will allow the customer to update the customer details. If customer address, city, state, email and phone number is updated.
-> update the values into customer, else print error
-> update the details of customer that has been updated by clicking onto update button.
-> If we need to cancel the particulars that has been updated, click onto back option.

2. View Information:
-> This program will allow the customer to view his/her own details.
-> If we need to go back from the particulars that has been viewed click onto back option.

3. Pay Bill:
-> This program will allow the customer to view bill details and redirects to pay.
-> the bill where status will be updated.
-> If we need to cancel the particulars that has been viewed click onto back option.
-> If we need to pay the bill amount that has been viewed click onto pay option.

4. Bill Details:
-> This program will allow the customer to view bill details.
-> If we need to print the particulars that has been viewed click onto print option.

5. Generate Bill:
-> This program will allow the customer to generate bill when 
meter_no and month is selected.
-> Generate the details by clicking on generatebill button.

NOTE: Utility (notepad, calculator), and logout is given to both customer and admin portals.

-----------------------------------------------------------------------------------------------------------------------------------------------------------
Software Requirements:

-> Operating System: -Windows 10

-> Software: -Microsoft SQL Server

-> Front End: -Java core/swings (NetBeans)

-> Back End: -My SQL
