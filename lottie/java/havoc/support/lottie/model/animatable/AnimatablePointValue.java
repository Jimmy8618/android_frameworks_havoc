package havoc.support.lottie.model.animatable;

import android.graphics.PointF;

import havoc.support.lottie.value.Keyframe;
import havoc.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import havoc.support.lottie.animation.keyframe.PointKeyframeAnimation;

import java.util.List;

public class AnimatablePointValue extends BaseAnimatableValue<PointF, PointF> {
  public AnimatablePointValue(List<Keyframe<PointF>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
    return new PointKeyframeAnimation(keyframes);
  }
}
