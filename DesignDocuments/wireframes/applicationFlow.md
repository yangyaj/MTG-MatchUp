# Application Flow


### User Sign up

1. User clicks to sign up
1. User fills out the sign up form and submits.
1. Request goes to sign up servlet.
1. Servlet creates a user object and then creates user in the database.
1. Response to user confirming addition (show a message on the jsp)

### User Logs In

1. User chooses sign in on the menu (available on all pages, unless the user
is signed in already).
1. User enters username and password on form and submits.
1. If user is authenticated, the server will handle allowing access to edit
pages.  JDBCRealm used for authentication (users, users_roles, and roles table).
1. If authentication fails, show error message/page.

### View Decks

1. User clicks on decks page.
1. Servlet uses the decks dao to get all decks.
1. User chooses deck which deck they want to view.

### About



### Add Comments
1. User may enter comments on deck they are currently viewing
