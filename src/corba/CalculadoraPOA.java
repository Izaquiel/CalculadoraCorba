package corba;


/**
* calc/CalculadoraPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from modulo.idl
* Quarta-feira, 26 de Novembro de 2014 17h08min05s BRST
*/

public abstract class CalculadoraPOA extends org.omg.PortableServer.Servant
 implements corba.CalculadoraOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("somar", new java.lang.Integer (0));
    _methods.put ("subtrair", new java.lang.Integer (1));
    _methods.put ("multiplicar", new java.lang.Integer (2));
    _methods.put ("dividir", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // calc/Calculadora/somar
       {
         int valor1 = in.read_long ();
         int valor2 = in.read_long ();
         int $result = (int)0;
         $result = this.somar (valor1, valor2);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 1:  // calc/Calculadora/subtrair
       {
         int valor1 = in.read_long ();
         int valor2 = in.read_long ();
         int $result = (int)0;
         $result = this.subtrair (valor1, valor2);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 2:  // calc/Calculadora/multiplicar
       {
         int valor1 = in.read_long ();
         int valor2 = in.read_long ();
         int $result = (int)0;
         $result = this.multiplicar (valor1, valor2);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 3:  // calc/Calculadora/dividir
       {
         int valor1 = in.read_long ();
         int valor2 = in.read_long ();
         double $result = (double)0;
         $result = this.dividir (valor1, valor2);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:calc/Calculadora:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Calculadora _this() 
  {
    return CalculadoraHelper.narrow(
    super._this_object());
  }

  public Calculadora _this(org.omg.CORBA.ORB orb) 
  {
    return CalculadoraHelper.narrow(
    super._this_object(orb));
  }


} // class CalculadoraPOA
