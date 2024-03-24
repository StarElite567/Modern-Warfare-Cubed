package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports
//Star
public class MBUSRearSight extends ModelWithAttachments {
	private final ModelRenderer Sight;
	private final ModelRenderer bone17_r1;
	private final ModelRenderer bone14_r1;
	private final ModelRenderer bone5_r1;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone7_r1;
	private final ModelRenderer bone4_r1;
	private final ModelRenderer bone3_r1;
	private final ModelRenderer bone2_r1;
	private final ModelRenderer bone6_r1;
	private final ModelRenderer bone12_r1;
	private final ModelRenderer bone14_r2;
	private final ModelRenderer bone16_r1;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer bone13_r1;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer sight44_r1;
	private final ModelRenderer sight26_r1;
	private final ModelRenderer sight23_r1;

	public MBUSRearSight() {
		textureWidth = 64;
		textureHeight = 64;

		Sight = new ModelRenderer(this);
		Sight.setRotationPoint(1.875F, 1.4908F, -2.7197F);
		Sight.cubeList.add(new ModelBox(Sight, 0, 17, -3.875F, 3.7092F, -5.9803F, 7, 3, 3, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 0, 44, -4.575F, 5.5092F, -5.9903F, 2, 2, 3, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 40, 13, 1.825F, 5.5092F, -5.9903F, 2, 2, 3, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 0, 0, -3.375F, -0.6908F, -0.2803F, 6, 2, 5, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 0, 7, -3.375F, -1.4408F, -0.2903F, 6, 1, 5, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 17, 0, -3.875F, 1.3092F, -0.2903F, 7, 3, 2, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 44, 35, -4.375F, 0.4092F, 2.2197F, 2, 3, 2, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 7, 35, 1.625F, 0.4092F, 2.2197F, 2, 3, 2, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 12, 37, -4.875F, 4.4092F, -0.2803F, 2, 3, 4, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 46, 6, -3.875F, 3.4092F, 1.7197F, 1, 3, 3, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 47, 46, -2.375F, 2.4092F, 1.7197F, 1, 4, 2, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 36, 4, -3.375F, 5.4092F, 2.7297F, 6, 1, 1, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 22, 29, 1.625F, 3.4092F, 2.4797F, 1, 2, 1, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 24, 18, -3.375F, 3.4092F, 2.4797F, 1, 2, 1, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 32, 47, 0.625F, 2.4092F, 1.7197F, 1, 4, 2, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 45, 40, 2.125F, 3.4092F, 1.7197F, 1, 3, 3, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 34, 8, -2.375F, 1.3092F, 0.7197F, 4, 1, 4, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 0, 35, 3.125F, 0.4092F, -0.2803F, 1, 4, 5, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 28, 30, 2.625F, -3.6908F, -0.2803F, 1, 5, 5, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 24, 45, -1.375F, -3.9908F, 1.7197F, 2, 4, 2, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 35, 30, -3.875F, 2.5092F, -1.0803F, 7, 2, 1, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 26, 40, -1.375F, -6.9908F, 1.7197F, 2, 1, 2, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 45, 18, 0.625F, -5.9908F, 1.7197F, 1, 6, 2, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 18, 45, -2.375F, -5.9908F, 1.7197F, 1, 6, 2, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 0, 23, -4.375F, -3.6908F, -0.2803F, 1, 5, 5, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 33, 13, -4.875F, 0.4092F, -0.2803F, 1, 4, 5, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 36, 36, 2.125F, 4.4092F, -0.2803F, 2, 3, 4, 0.0F, false));

		bone17_r1 = new ModelRenderer(this);
		bone17_r1.setRotationPoint(3.0F, 0.0F, 0.0F);
		Sight.addChild(bone17_r1);
		setRotationAngle(bone17_r1, 0.0F, 0.0F, -2.6354F);
		bone17_r1.cubeList.add(new ModelBox(bone17_r1, 22, 12, -4.946F, -6.7976F, -0.2803F, 4, 2, 4, 0.0F, false));

		bone14_r1 = new ModelRenderer(this);
		bone14_r1.setRotationPoint(-3.0F, 0.0F, 0.0F);
		Sight.addChild(bone14_r1);
		setRotationAngle(bone14_r1, 0.0F, 0.0F, 0.7854F);
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 37, 22, -1.0365F, 0.6152F, -0.2903F, 1, 1, 5, 0.0F, false));

		bone5_r1 = new ModelRenderer(this);
		bone5_r1.setRotationPoint(-3.0F, 0.0F, 0.0F);
		Sight.addChild(bone5_r1);
		setRotationAngle(bone5_r1, 0.192F, 0.0F, 0.0F);
		bone5_r1.cubeList.add(new ModelBox(bone5_r1, 24, 18, -1.375F, -6.4443F, 1.5328F, 1, 1, 4, 0.0F, false));
		bone5_r1.cubeList.add(new ModelBox(bone5_r1, 22, 30, 5.625F, -6.4443F, 1.5328F, 1, 1, 4, 0.0F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(-3.0F, 0.0F, 0.0F);
		Sight.addChild(bone8_r1);
		setRotationAngle(bone8_r1, -1.4486F, 0.0F, 0.0F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 31, 40, -1.365F, -5.1344F, -6.088F, 1, 4, 3, 0.0F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 39, 43, 5.615F, -5.1344F, -6.088F, 1, 4, 3, 0.0F, false));

		bone7_r1 = new ModelRenderer(this);
		bone7_r1.setRotationPoint(-3.0F, 0.0F, 0.0F);
		Sight.addChild(bone7_r1);
		setRotationAngle(bone7_r1, 1.3788F, 0.0F, 0.0F);
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 7, 23, -1.375F, -0.9794F, 3.5695F, 1, 1, 3, 0.0F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 46, 26, 5.625F, -0.9794F, 3.5695F, 1, 1, 3, 0.0F, false));

		bone4_r1 = new ModelRenderer(this);
		bone4_r1.setRotationPoint(-0.75F, 0.0F, 0.0F);
		Sight.addChild(bone4_r1);
		setRotationAngle(bone4_r1, -0.6981F, 0.0F, 0.0F);
		bone4_r1.cubeList.add(new ModelBox(bone4_r1, 33, 22, 2.875F, 1.939F, 6.7132F, 2, 1, 1, 0.0F, false));
		bone4_r1.cubeList.add(new ModelBox(bone4_r1, 20, 37, -4.125F, 1.939F, 6.7132F, 2, 1, 1, 0.0F, false));

		bone3_r1 = new ModelRenderer(this);
		bone3_r1.setRotationPoint(-0.75F, 0.0F, 0.0F);
		Sight.addChild(bone3_r1);
		setRotationAngle(bone3_r1, 0.0F, 0.0F, -0.6981F);
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 0, 0, -0.6369F, 2.238F, 3.7197F, 1, 3, 1, 0.0F, false));

		bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(-0.75F, 0.0F, 0.0F);
		Sight.addChild(bone2_r1);
		setRotationAngle(bone2_r1, 0.0F, 0.0F, 0.6981F);
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 0, 7, 0.2115F, 1.7559F, 3.7197F, 1, 3, 1, 0.0F, false));

		bone6_r1 = new ModelRenderer(this);
		bone6_r1.setRotationPoint(-0.75F, 0.0F, 0.0F);
		Sight.addChild(bone6_r1);
		setRotationAngle(bone6_r1, 0.7854F, 0.0F, 0.0F);
		bone6_r1.cubeList.add(new ModelBox(bone6_r1, 35, 33, -2.615F, 4.8894F, -2.0532F, 6, 1, 1, 0.0F, false));
		bone6_r1.cubeList.add(new ModelBox(bone6_r1, 35, 0, -2.615F, -0.7068F, 1.543F, 6, 2, 2, 0.0F, false));

		bone12_r1 = new ModelRenderer(this);
		bone12_r1.setRotationPoint(-0.75F, 0.0F, 0.0F);
		Sight.addChild(bone12_r1);
		setRotationAngle(bone12_r1, 0.0F, 0.0F, -0.7854F);
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 0, 26, -4.9839F, -0.4355F, -1.0803F, 1, 1, 1, 0.0F, false));
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 28, 30, -0.0342F, 4.5143F, -1.0803F, 1, 1, 1, 0.0F, false));

		bone14_r2 = new ModelRenderer(this);
		bone14_r2.setRotationPoint(-0.75F, 0.0F, 0.0F);
		Sight.addChild(bone14_r2);
		setRotationAngle(bone14_r2, 0.0F, 0.0F, -0.7854F);
		bone14_r2.cubeList.add(new ModelBox(bone14_r2, 19, 39, 2.1578F, 2.7365F, -0.2903F, 1, 1, 5, 0.0F, false));

		bone16_r1 = new ModelRenderer(this);
		bone16_r1.setRotationPoint(-0.75F, 0.0F, 0.0F);
		Sight.addChild(bone16_r1);
		setRotationAngle(bone16_r1, 0.0F, 0.0F, 2.6354F);
		bone16_r1.cubeList.add(new ModelBox(bone16_r1, 25, 24, 3.5698F, -5.3431F, -0.2803F, 4, 2, 4, 0.0F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(-0.75F, 0.0F, 0.0F);
		Sight.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.2967F, 0.0F, 0.0F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 0, 23, -3.635F, -1.1032F, 4.227F, 1, 2, 1, 0.0F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 0, 13, -4.125F, 4.4824F, -4.8138F, 9, 2, 2, 0.0F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 10, 44, 3.725F, -2.4778F, 1.0278F, 1, 3, 3, 0.0F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 15, 18, -5.375F, -3.8534F, 0.3597F, 2, 5, 5, 0.0F, false));

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(-0.75F, 0.0F, 0.0F);
		Sight.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 0.2443F, 0.0F, 0.0F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 6, 27, -3.835F, 2.8991F, -7.1352F, 1, 2, 6, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 14, 29, 3.585F, 2.8991F, -7.1352F, 1, 2, 6, 0.0F, false));

		bone13_r1 = new ModelRenderer(this);
		bone13_r1.setRotationPoint(-0.75F, 0.0F, 0.0F);
		Sight.addChild(bone13_r1);
		setRotationAngle(bone13_r1, -1.3788F, 0.0F, 0.0F);
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 14, 28, -3.825F, 0.2698F, 4.9673F, 1, 2, 2, 0.0F, false));
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 48, 12, 3.575F, 0.2698F, 4.9673F, 1, 2, 2, 0.0F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(-0.75F, 0.0F, 0.0F);
		Sight.addChild(bone10_r1);
		setRotationAngle(bone10_r1, -1.3968F, 0.1715F, -0.7704F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 0, 33, 0.2025F, 1.6537F, 4.2775F, 1, 5, 1, 0.0F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 0, 49, -4.7473F, 1.6537F, -0.6722F, 1, 5, 1, 0.0F, false));

		sight44_r1 = new ModelRenderer(this);
		sight44_r1.setRotationPoint(-0.75F, 0.0F, 0.0F);
		Sight.addChild(sight44_r1);
		setRotationAngle(sight44_r1, -1.3271F, 0.0F, 0.0F);
		sight44_r1.cubeList.add(new ModelBox(sight44_r1, 20, 5, -3.125F, 1.6537F, 2.1743F, 7, 5, 2, 0.0F, false));

		sight26_r1 = new ModelRenderer(this);
		sight26_r1.setRotationPoint(-0.75F, 0.0F, 0.0F);
		Sight.addChild(sight26_r1);
		setRotationAngle(sight26_r1, 0.0F, 0.0F, -0.7854F);
		sight26_r1.cubeList.add(new ModelBox(sight26_r1, 20, 12, 3.4871F, -5.3852F, 1.7197F, 1, 1, 2, -0.0078F, false));
		sight26_r1.cubeList.add(new ModelBox(sight26_r1, 7, 44, 3.476F, -2.1679F, 1.7097F, 1, 1, 2, 0.0F, false));
		sight26_r1.cubeList.add(new ModelBox(sight26_r1, 49, 2, 1.6729F, -3.971F, 1.7097F, 1, 1, 2, 0.0F, false));
		sight26_r1.cubeList.add(new ModelBox(sight26_r1, 4, 49, 3.0871F, -5.3852F, 1.7197F, 1, 1, 2, -0.0039F, false));

		sight23_r1 = new ModelRenderer(this);
		sight23_r1.setRotationPoint(-0.75F, 0.0F, 0.0F);
		Sight.addChild(sight23_r1);
		setRotationAngle(sight23_r1, 0.0F, 0.0F, 2.3562F);
		sight23_r1.cubeList.add(new ModelBox(sight23_r1, 49, 16, -5.9155F, 2.9568F, 1.7197F, 1, 1, 2, -0.0078F, false));
		sight23_r1.cubeList.add(new ModelBox(sight23_r1, 49, 31, -5.9155F, 2.5568F, 1.7197F, 1, 1, 2, -0.0039F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Sight.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}