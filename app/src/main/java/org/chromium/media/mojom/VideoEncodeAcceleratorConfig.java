
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/interfaces/video_encode_accelerator.mojom
//

package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class VideoEncodeAcceleratorConfig extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

    public static final class ContentType {


        public static final int CAMERA = 0;

        public static final int DISPLAY = CAMERA + 1;

        public static final int MIN_VALUE = (int) (0);
        public static final int MAX_VALUE = (int) (1);

        private static final boolean IS_EXTENSIBLE = false;

        public static boolean isKnownValue(int value) {
            switch (value) {
                case 0:
                case 1:
                    return true;
            }
            return false;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value))
                return;

            throw new DeserializationException("Invalid enum value.");
        }

        private ContentType() {}

    }
    public int inputFormat;
    public org.chromium.gfx.mojom.Size inputVisibleSize;
    public int outputProfile;
    public int initialBitrate;
    public int initialFramerate;
    public boolean hasInitialFramerate;
    public byte h264OutputLevel;
    public boolean hasH264OutputLevel;
    public int contentType;

    private VideoEncodeAcceleratorConfig(int version) {
        super(STRUCT_SIZE, version);
    }

    public VideoEncodeAcceleratorConfig() {
        this(0);
    }

    public static VideoEncodeAcceleratorConfig deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static VideoEncodeAcceleratorConfig deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static VideoEncodeAcceleratorConfig decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        VideoEncodeAcceleratorConfig result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new VideoEncodeAcceleratorConfig(elementsOrVersion);
                {
                    
                result.inputFormat = decoder0.readInt(8);
                    VideoPixelFormat.validate(result.inputFormat);
                }
                {
                    
                result.outputProfile = decoder0.readInt(12);
                    VideoCodecProfile.validate(result.outputProfile);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.inputVisibleSize = org.chromium.gfx.mojom.Size.decode(decoder1);
                }
                {
                    
                result.initialBitrate = decoder0.readInt(24);
                }
                {
                    
                result.initialFramerate = decoder0.readInt(28);
                }
                {
                    
                result.hasInitialFramerate = decoder0.readBoolean(32, 0);
                }
                {
                    
                result.hasH264OutputLevel = decoder0.readBoolean(32, 1);
                }
                {
                    
                result.h264OutputLevel = decoder0.readByte(33);
                }
                {
                    
                result.contentType = decoder0.readInt(36);
                    VideoEncodeAcceleratorConfig.ContentType.validate(result.contentType);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.inputFormat, 8);
        
        encoder0.encode(this.outputProfile, 12);
        
        encoder0.encode(this.inputVisibleSize, 16, false);
        
        encoder0.encode(this.initialBitrate, 24);
        
        encoder0.encode(this.initialFramerate, 28);
        
        encoder0.encode(this.hasInitialFramerate, 32, 0);
        
        encoder0.encode(this.hasH264OutputLevel, 32, 1);
        
        encoder0.encode(this.h264OutputLevel, 33);
        
        encoder0.encode(this.contentType, 36);
    }
}