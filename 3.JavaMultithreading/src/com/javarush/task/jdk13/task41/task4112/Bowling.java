package com.javarush.task.jdk13.task41.task4112;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Objects.nonNull;

public class Bowling {
    private final Queue<Track> tracks = new ConcurrentLinkedQueue<>();
    private final Queue<PairOfShoes> shoesShelf = new ConcurrentLinkedQueue<>();

    public Bowling(int tracksNumber) {
        for (int i = 1; i <= tracksNumber; i++) {
            tracks.offer(new Track(i));
        }
        for (int i = 0; i < 50 ; i++) {
            shoesShelf.offer(new PairOfShoes(ThreadLocalRandom.current().nextInt(38, 46)));
        }
    }

    public synchronized Track acquireTrack() {
        Track track = tracks.poll();
        if (nonNull(track)) {
            track.setPrice(100 - tracks.size() * 10);
        }
        return track;
    }

    public synchronized void releaseTrack(Track track) {
        System.out.printf("C дорожки №%d сняли бронь\n", track.getNumber());
        tracks.offer(track);
    }

    public synchronized Set<PairOfShoes> acquireShoes(int number) {
        if (shoesShelf.size() < number) {
            return null;
        }

        Set<PairOfShoes> result = new HashSet<>();
        for (int i = 0; i < number; i++) {
            result.add(shoesShelf.poll());
        }
        return result;
    }

    public synchronized void releaseShoes(Set<PairOfShoes> shoes) {
        System.out.printf("В гардероб вернули %d пар обуви\n", shoes.size());
        this.shoesShelf.addAll(shoes);
    }
}
