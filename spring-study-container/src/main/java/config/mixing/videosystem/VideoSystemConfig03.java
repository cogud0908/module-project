package config.mixing.videosystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.douzone.springcontainer.videosystem.DVDPlayer;
import com.douzone.springcontainer.videosystem.DigitalVideoDisc;

@Configuration
@Import({DVDConfig.class, DVDPlayerConfig.class})
@ImportResource("classpath:config/mixing/videosystem/DVDConfig.xml")
public class VideoSystemConfig03 {
	
	public DVDPlayer dvdPlayer(@Qualifier("avegers") DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}
}
