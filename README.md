# BeekeeperStockSystem
Intro

Being a beekeeper i have long wanted a application that can help me keep track of my stock and sails. There is currently no application that specifically caters to all my needs, thus is decided to design an application that will fulfill those needs.

Description of the Domain Model and its Invariants

According to the domain model there can be more than one beekeeper active. Currently i am the only beekeeper but i would like to expand in the future. One beekeeper can manage one or many different locations. Each location can have one or many different sites which will be logged using the GPS coordinates. Each site can have zero or many hives. Reason for it being able to have zero hives is that sometimes the location is destroyed by a fire or there is not enough flora around then the hives will be removed but it will be nice keep track of the site even though its not active ATM. Hive will have a status that will tell me if it is active or not. Bees sometime leave there hive looking for a better location. Each hive can have zero or many supers. If a hive has zero supers it will mean that the hive is weak or that the season has ended at that specific location. A super can exist without a hive. The super will have a status attribute. This will be used to see how many supers i have spare. 
According to the domain model every time i harvest honey from a specific location it will be logged using the date and site location ID as the primary key. In order to keep track of how much is harvested and how much is remaining there will be two attributes. One logging the total harvested that day(The value wont change again) and another that will keep track of how much is still remaining. After each harvest the honey gets bottled into various categories(different weight sizes). For example. I harvested 85kg form site b. That gets split up into 1*20kg, 4*5kg, 20*1kg, 50*500g. 
The stock then becomes available to be sold. An order is placed by a customer. The salesman then logs the order. The stock is removed from the stock entity. 
This application will allow me to not only keep track of my sales but also my honey stock and hive statuses. It will also allow me to see which site performs the best etc. 

Picture is linked separately 
