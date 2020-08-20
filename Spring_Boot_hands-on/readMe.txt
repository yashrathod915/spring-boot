

*All the operations has been done.

*The fuction used to achieve the functionality are:-
  -public UserDto addUser(UserDto userDto);
  -public String addProductToCart(int userId, int productId) throws ShoppingCartException;  
  -public String removeProductFromCart(int productId, int cartId) throws ShoppingCartException;
  -public String removeAllProductFromCart(int cartId) throws CartIdNotFoundException;
  -public CartDto viewCart(int cartId) throws CartIdNotFoundException;
  -public String updateCart(int cartId, int productId, int quantity) throws ShoppingCartException;

*A proper folder structure is maintained with javadoc comments.

*NamedQuery is being implemented on the product entity to find the product by product Name.
  -public ProductDto product(String productName);

*Tansaction Management is done in services and main application.