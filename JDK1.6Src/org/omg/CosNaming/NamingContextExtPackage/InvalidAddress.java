package org.omg.CosNaming.NamingContextExtPackage;


/**
* org/omg/CosNaming/NamingContextExtPackage/InvalidAddress.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/CosNaming/nameservice.idl
* Tuesday, August 28, 2012 3:50:16 PM GMT-08:00
*/

public final class InvalidAddress extends org.omg.CORBA.UserException
{

  public InvalidAddress ()
  {
    super(InvalidAddressHelper.id());
  } // ctor


  public InvalidAddress (String $reason)
  {
    super(InvalidAddressHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidAddress
