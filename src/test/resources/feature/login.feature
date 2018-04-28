Feature: Test smoke scenarios of application

Scenario Outline: Validate login functionality of application
    Given Navigate to application
    When Click on Sign in link
    And Enter username as "<Username>"
    And Enter password as "<Password>"
    And Click on Sign In button
    Then User should be able to login, Able to see success message "<Message>"

    Examples: 
      | Username                   | Password | Message                                                                                   |
      | seleniumcucumber@gmail.com | dummy    | Welcome to your account. Here you can manage all of your personal information and orders. |
      
      Scenario Outline: Purchase one product from online shopping
    Given Navigate to application site
    When Login into the application with valid username as "<username>" Password as "<password>"
    And Click on Casual Dresses menu from HomePage
    And Click on Product from ProductsListPage
    And Click on Addtocart from ProductDetailsPage
    And Click on ProceedToCheckout from CartPage
    And Click on ProceedToCheckout from ShoppingCartSummaryPage
    And Click on ProceedToCheckout from AddressPage
    And Click on ProceedToCheckout from ShippingPage
    And Select the Payment Method from PaymentPage
    And Click on Confirmation button from OrderSummaryPage
    Then Verify message as "<message>" in OrderConfimationPage

    Examples: 
      | username                   | password | message            |
      | seleniumcucumber@gmail.com | dummy    | ORDER CONFIRMATION |
      

  
  Scenario: Share a product details with social media
    Given Login into application
    When Serach product as "BLOUSE" in serach bar of the homepage
    And Click on More button on the product surface
    And Click on Facebook Share button in productdetails page
    And Click on Pinterest Share button in productdetails page
    Then Switch to respective windows and perform some opertations and close windows
    And Switch back to Parent wondow and perform some opertaions on parent window
    
    
    Scenario: Write a review on product
     Given Login into application
    When Serach product as "BLOUSE" in serach bar of the homepage
    And Click on More button on the product surface
    And Click on Write a review
    And Fill all fields and click on Send button
    And Read the text message from popup window
    Then Click on OK on review submitted confimation popup
    
    
    Scenario: Close the windows based popup window
    Given Login into application
    When Serach product as "BLOUSE" in serach bar of the homepage
    And Click on More button on the product surface
    And Click on Print button on product details page
    Then Close the windows based popup window
    
    
    Scenario: Contact Customer service with product details File Upload
    Given Login into application
    When Click on Contact us link in home page
    And Select Suject Heading as "Customer Service"
    And Select Order reference 
    And Select the product
    And Enter some comments on message body
    And Upload File
    And Click on Send Button
    Then Verify Success message
    
    @SEL
    Scenario: Download PDF File
    Given Login into application
    When Click on My Account link
    And Click on Order History and details
    And Click on PDF link
    Then Download  the file using autoit
    
    
