package main.webapp.services;

import main.webapp.ressources.Hotel;
import main.webapp.ressources.RoomType;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.Random;

@WebService
public class HotelService {

    private final Random random;

    public HotelService() {
        this.random = new Random();
    }

    @WebMethod
    //public @WebResult (name = "hotel") Hotel getHotel(@WebParam(name = "hotelcode") int hotelCode) {
    public Hotel getHotel() {

        //random.setSeed(hotelCode);
        RoomType room = RoomType.randomEnum();
        Hotel hotel = new Hotel();
        hotel.setCode(1);
        int hotelPrice = random.nextInt((200 - 100) + 1) + 100;
        hotel.setPrice(hotelPrice);
        hotel.setRoomtype(room);
        return hotel;
    }

    public static void main(String[] args ){
        Endpoint.publish("http://159.31.58.100:8080/HotelService", new HotelService());
    }
}
