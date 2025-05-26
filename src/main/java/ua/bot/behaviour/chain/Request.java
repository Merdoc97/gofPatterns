package ua.bot.behaviour.chain;

/**
 * The Request class encapsulates the data sent to the chain of handlers.
 */
public class Request {
    
    private String type;
    private String content;
    
    /**
     * Constructor initializes the request with a type and content.
     * 
     * @param type the request type
     * @param content the request content
     */
    public Request(String type, String content) {
        this.type = type;
        this.content = content;
    }
    
    /**
     * Gets the request type.
     * 
     * @return the request type
     */
    public String getType() {
        return type;
    }
    
    /**
     * Gets the request content.
     * 
     * @return the request content
     */
    public String getContent() {
        return content;
    }
    
    @Override
    public String toString() {
        return "Request{type='" + type + "', content='" + content + "'}";
    }
}
