package interfaces;

/**
* interfaces/UserServiceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from UserApp.idl
* piątek, 25 listopada 2016 08:40:29 CET
*/

public final class UserServiceHolder implements org.omg.CORBA.portable.Streamable
{
  public UserService value = null;

  public UserServiceHolder ()
  {
  }

  public UserServiceHolder (UserService initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = UserServiceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    UserServiceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return UserServiceHelper.type ();
  }

}
