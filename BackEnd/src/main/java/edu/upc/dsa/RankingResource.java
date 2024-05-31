package edu.upc.dsa;



import edu.upc.dsa.models.Message;
import edu.upc.dsa.models.Ranking;

import java.util.ArrayList;
import java.util.List;

public class RankingResource {

    public List<Ranking> getRankings() {
        List<Ranking> messages = new ArrayList<>();
        messages.add(new Ranking("Alicia", "https://imgs.search.brave.com/OOwHtmoTTZxjeizhpg7CkFgGB02DbaU6fVl4ppfIVks/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9wbHVz/LnVuc3BsYXNoLmNv/bS9wcmVtaXVtX3Bo/b3RvLTE2OTE3ODQ3/Nzg4MDUtZTEwNjdh/YzQyZTAxP3E9ODAm/dz0xMDAwJmF1dG89/Zm9ybWF0JmZpdD1j/cm9wJml4bGliPXJi/LTQuMC4zJml4aWQ9/TTN3eE1qQTNmREI4/TUh4amIyeHNaV04w/YVc5dUxYQmhaMlY4/TVRCOGVFUnZNalJw/VDJ0S2JWVjhmR1Z1/ZkRCOGZIeDhmQT09", 10));
        messages.add(new Ranking("Pol", "https://imgs.search.brave.com/kscyHLPVBFgcF6WFyddQH0R3ZcnaMXG5ikc4NKPhoQ4/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9wbHVz/LnVuc3BsYXNoLmNv/bS9wcmVtaXVtX3Bo/b3RvLTE2OTE3ODQ3/ODE0ODItOWFmOWJj/ZTA1MDk2P3E9ODAm/dz0xMDAwJmF1dG89/Zm9ybWF0JmZpdD1j/cm9wJml4bGliPXJi/LTQuMC4zJml4aWQ9/TTN3eE1qQTNmREI4/TUh4amIyeHNaV04w/YVc5dUxYQmhaMlY4/T1h4NFJHOHlOR2xQ/YTBwdFZYeDhaVzU4/TUh4OGZIeDg", 40));
        messages.add(new Ranking("Bruno", "https://imgs.search.brave.com/6_DYVaSApjPXbueEO2OZuSl6sMF7ZA1aTOO5aQle224/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9wbHVz/LnVuc3BsYXNoLmNv/bS9wcmVtaXVtX3Bo/b3RvLTE2OTA1Nzk4/MDUyNzMtZmQwYzdi/MDgwMzVkP3E9ODAm/dz0xMDAwJmF1dG89/Zm9ybWF0JmZpdD1j/cm9wJml4bGliPXJi/LTQuMC4zJml4aWQ9/TTN3eE1qQTNmREI4/TUh4amIyeHNaV04w/YVc5dUxYQmhaMlY4/TVRGOGVFUnZNalJw/VDJ0S2JWVjhmR1Z1/ZkRCOGZIeDhmQT09", 30));
        return messages;
    }
}
