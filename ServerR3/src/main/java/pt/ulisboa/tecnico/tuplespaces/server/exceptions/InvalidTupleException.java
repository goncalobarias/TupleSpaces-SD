package pt.ulisboa.tecnico.tuplespaces.server.exceptions;

/** Represents an exception thrown when an invalid tuple/pattern is found. **/
public class InvalidTupleException extends RuntimeException {

    public InvalidTupleException(String input) {
        super(
                "The tuple/pattern '" + input +
                        "' is invalid. A valid tuple has the format <element[,more_elements]> with no spaces."
        );
    }

}
