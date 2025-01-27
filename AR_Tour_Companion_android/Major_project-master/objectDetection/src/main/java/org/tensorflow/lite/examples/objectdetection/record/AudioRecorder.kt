package org.tensorflow.lite.examples.objectdetection.record

import java.io.File

interface AudioRecorder {
    fun start(outputFile: File)
    fun stop()
}