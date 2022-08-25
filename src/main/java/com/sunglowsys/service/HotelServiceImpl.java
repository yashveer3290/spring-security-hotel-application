package com.sunglowsys.service;

import com.sunglowsys.domain.Hotel;
import com.sunglowsys.repository.HotelRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class HotelServiceImpl implements HotelService{

    private final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public Hotel save(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel update(Hotel hotel, Long id) {
        Hotel hotel1 = hotelRepository.findById(id).get();
        hotel1.setName(hotel.getName());
        hotel1.setType(hotel.getType());
        hotel1.setAddress(hotel.getAddress());

        return hotelRepository.save(hotel1);
    }

    @Override
    public Page<Hotel> findAll(Pageable pageable) {
        return hotelRepository.findAll(pageable);
    }

    @Override
    public Optional<Hotel> findOne(Long id) {
        return hotelRepository.findById(id);
    }

    @Override
    public void delete(Long id) {

        hotelRepository.deleteById(id);

    }
}
