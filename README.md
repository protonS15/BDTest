# BDTest

//WELCOME PAGE -- scenarios

1. Validate on launching URL in browser - BlazeDemo "Welcome Page" is loaded with title - "BlazeDemo".

2. Validate the links present to page are not broken.

3. Validate the link text displayed are as expected.

4. Validate On clicking "Travel the World" link same page is loaded and title = "BlazeDemo" is displayed.

5. Validate on clicking "Home" link - Login page is loaded.

6. Validate on clicking "Destnation of the week link", the destination page is loaded with Hawai as title and the image is loaded and displayed.

7. Validate the header displayed as - "Welcome to the Simple Travel Agency!"

8. Proper select label displayed -
	Enter depart city from the select dropdown.
	Enter destination city from the selet dropdown.

	Validate the select options displayed as expected.

9. Validate the default city displayed in select tag fields for depart and destination.

10. Dropdown should be enabled and displayed with expected city select option list for Depart and destination fields on click.

11. On click of "Find Flights" buttons - user should be navigated to availability page.



//AVAIL PAGE -- scenarios

1. Validate user is on Avail page and title - "BlazeDemo - reserve" is dispalyed.

2. Validate the avail page header text contains the selected depart and destination city from Welcome page.

3. Validate expected column header and label displayed as expected.

4. The flight availability is displayed with "Choose this flight" button displayed adjacent to flight details row.

5. Select the respective flight option and click on "Choose this flight" button, user should be navigated to purchase flight page.



//PURCHASE FLIGHT PAGE -- scenarios

1. Validate user is on purchase flight page and title - "BlazeDemo Purchase" is displayed.

2. Rretrieve the header and validate if the header contains source and destination.

3. Validate selected airline details displayed under header.

4. Validate "Total cost = Price + Arbitrary Fees and Taxes".

5. Fill in the purchase flight form details -
 
 Assumptions:
 	Name - (validate only characters are allowed with 50 chars limit)
 	Address - (Alphanumeric chracters with size limit - 70 char)
 	City - valid city to be entered, selected from google autocomplete API.
 	State - valid state to be entered, selected from google autocomplete API.
 	Zipcode - valid zipcode in numeric, with limit to 7 chars.
 	CardType - select dropdown should be displayed with valid card selection types.
 	Credit card number - Only numeric chars allowed with limit 16.
 	Month - numeric (limit - 2)
 	Year - numeric (limit -4)
 	name on Card - (validate only characters are allowed with 50 chars limit)

 6. Once the details are filled, click on "Purchase flight" button, user should be navigated to purchase confirmation page.


 // PURCHASE CONFIRMATION PAGE

 1. Validate the page title and header.
 2. Header contains from -- to cities.
 3. Validate the booking confirmation ID and flight details mentioned.
 

#Pending tasks

1. Replace the print lines with loggers (log4j) implementation.
2. Screenshots to be attached in the extent report.
3. Documentation needs to be added for each method.
4. handling test data in better format, multiple issues on application so validation was tricky as irrespective of the fact whichever cities I choose, the test data in avail page displayed are static, similarly the header remain fixed in "Payments page", the test fields (while filling the form has no restrictions and mandatory fields not highlighted).







