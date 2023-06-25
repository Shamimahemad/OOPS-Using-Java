package com.demo.service;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public interface MyService {

	default void copyData(ReadableByteChannel src, WritableByteChannel dest) {
		ByteBuffer buff=ByteBuffer.allocate(60);
		try {
			while(src.read(buff)!=-1) {
				//to drain the data from buffer 
				buff.flip();
				while(buff.hasRemaining()) {
					dest.write(buff);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
