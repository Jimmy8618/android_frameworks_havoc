package havoc.support.lottie.parser;

import android.util.JsonReader;

import havoc.support.lottie.LottieComposition;
import havoc.support.lottie.model.animatable.AnimatableShapeValue;
import havoc.support.lottie.model.content.ShapePath;

import java.io.IOException;

class ShapePathParser {

  private ShapePathParser() {}

  static ShapePath parse(
      JsonReader reader, LottieComposition composition) throws IOException {
    String name = null;
    int ind = 0;
    AnimatableShapeValue shape = null;

    while (reader.hasNext()) {
      switch (reader.nextName()) {
        case "nm":
          name = reader.nextString();
          break;
        case "ind":
          ind = reader.nextInt();
          break;
        case "ks":
          shape = AnimatableValueParser.parseShapeData(reader, composition);
          break;
        default:
          reader.skipValue();
      }
    }

    return new ShapePath(name, ind, shape);
  }
}
