package main.webapp.ressources;

import javax.xml.bind.annotation.XmlElement;

public class Hotel {

    private int code;
    private int price;
    private RoomType roomType;

    /**
     * @return the code
     */
    //@XmlElement(name = "code")
    public int getCode() {
        return code;
    }

    /**
     * @param code the price to set
     */
    public void setCode(int code) {
        this.code = code;
    }


    /**
     * @return the price
     */
    //@XmlElement(name = "price")
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the roomType
     */
    //@XmlElement(name = "roomType")
    public RoomType getRoomtype() {
        return roomType;
    }

    /**
     * @param roomType the roomType to set
     */
    public void setRoomtype(RoomType roomType) {
        this.roomType = roomType;
    }


}
