package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports
//Star
public class MBUSFrontSight extends ModelWithAttachments {
	private final ModelRenderer bone;
	private final ModelRenderer bone4_r1;
	private final ModelRenderer bone3_r1;
	private final ModelRenderer bone2_r1;
	private final ModelRenderer bone6_r1;
	private final ModelRenderer bone12_r1;
	private final ModelRenderer bone14_r1;
	private final ModelRenderer bone16_r1;
	private final ModelRenderer bone15_r1;
	private final ModelRenderer bone23_r1;
	private final ModelRenderer bone22_r1;
	private final ModelRenderer bone21_r1;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone7_r1;
	private final ModelRenderer bone5_r1;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone18_r1;
	private final ModelRenderer bone17_r1;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer sight44_r1;
	private final ModelRenderer bone13_r1;

	public MBUSFrontSight() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 19.8248F, -9.4718F);
		bone.cubeList.add(new ModelBox(bone, 0, 12, -2.0F, -14.6248F, 0.7718F, 7, 3, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 7, 45, -2.7F, -12.8248F, 0.7618F, 2, 2, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 43, 0, 3.7F, -12.8248F, 0.7618F, 2, 2, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 31, 35, 2.5F, -21.7748F, 6.4618F, 2, 2, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 35, -1.5F, -21.7748F, 6.4618F, 2, 2, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 19, 33, -0.2F, -21.5748F, 6.4818F, 1, 4, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 42, -0.2F, -21.3748F, 7.4818F, 3, 4, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 29, 26, 2.2F, -21.5748F, 6.4818F, 1, 4, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 4, -2.0F, -20.0248F, 6.4608F, 7, 6, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 29, 1, -2.5F, -22.0248F, 6.4718F, 1, 5, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 29, 16, -3.0F, -17.9248F, 6.4718F, 1, 4, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 42, 43, -2.49F, -19.9248F, 8.9718F, 2, 5, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 34, 42, 3.49F, -19.9248F, 8.9718F, 2, 5, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 37, 21, -3.0F, -13.9248F, 6.4718F, 2, 3, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 36, 14, 4.0F, -13.9248F, 6.4718F, 2, 3, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 46, 11, -2.0F, -14.9248F, 8.4718F, 1, 3, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 47, 36, -0.5F, -15.9248F, 8.4718F, 1, 4, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 40, 34, -1.5F, -12.9248F, 9.4818F, 6, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 30, 16, 3.5F, -14.9248F, 9.2318F, 1, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 12, 30, -1.5F, -14.9248F, 9.2318F, 1, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 20, 21, 2.5F, -15.9248F, 8.4718F, 1, 4, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 45, 18, 4.0F, -14.9248F, 8.4718F, 1, 3, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 17, 8, -0.5F, -19.0248F, 7.4618F, 4, 3, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 12, 29, 5.0F, -17.9248F, 6.4718F, 1, 4, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 25, 4.5F, -22.0248F, 6.4718F, 1, 5, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 48, 1.0F, -23.4248F, 8.4718F, 1, 5, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 33, 11, -2.0F, -15.8248F, 5.6718F, 7, 2, 1, 0.0F, false));

		bone4_r1 = new ModelRenderer(this);
		bone4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone4_r1);
		setRotationAngle(bone4_r1, -0.6981F, 0.0F, 0.0F);
		bone4_r1.cubeList.add(new ModelBox(bone4_r1, 12, 25, 4.0F, -16.446F, 0.1013F, 2, 1, 1, 0.0F, false));
		bone4_r1.cubeList.add(new ModelBox(bone4_r1, 32, 14, -3.0F, -16.446F, 0.1013F, 2, 1, 1, 0.0F, false));

		bone3_r1 = new ModelRenderer(this);
		bone3_r1.setRotationPoint(12.2252F, 3.3653F, 9.4718F);
		bone.addChild(bone3_r1);
		setRotationAngle(bone3_r1, 0.0F, 0.0F, -0.6981F);
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 0, 25, 4.8071F, -21.5199F, 1.0F, 1, 3, 1, 0.0F, false));

		bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(-11.5234F, 1.437F, 9.4718F);
		bone.addChild(bone2_r1);
		setRotationAngle(bone2_r1, 0.0F, 0.0F, 0.6981F);
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 30, 0, -2.8071F, -21.5199F, 1.0F, 1, 3, 1, 0.0F, false));

		bone6_r1 = new ModelRenderer(this);
		bone6_r1.setRotationPoint(0.0F, -2.6229F, 27.2838F);
		bone.addChild(bone6_r1);
		setRotationAngle(bone6_r1, 0.7854F, 0.0F, 0.0F);
		bone6_r1.cubeList.add(new ModelBox(bone6_r1, 36, 28, -1.49F, -20.7381F, -5.4619F, 6, 1, 1, 0.0F, false));

		bone12_r1 = new ModelRenderer(this);
		bone12_r1.setRotationPoint(14.8995F, 2.1457F, 9.4718F);
		bone.addChild(bone12_r1);
		setRotationAngle(bone12_r1, 0.0F, 0.0F, -0.7854F);
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 24, 21, -0.2426F, -24.6569F, -3.8F, 1, 1, 1, 0.0F, false));
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 26, 34, 4.7071F, -19.7071F, -3.8F, 1, 1, 1, 0.0F, false));

		bone14_r1 = new ModelRenderer(this);
		bone14_r1.setRotationPoint(17.3845F, 1.9449F, 9.4718F);
		bone.addChild(bone14_r1);
		setRotationAngle(bone14_r1, 0.0F, 0.0F, -0.7854F);
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 36, 0, -0.364F, -28.464F, -3.01F, 1, 1, 5, 0.0F, false));
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 9, 38, 5.0F, -23.1F, -3.01F, 1, 1, 5, 0.0F, false));

		bone16_r1 = new ModelRenderer(this);
		bone16_r1.setRotationPoint(-13.3329F, -24.1764F, 9.4718F);
		bone.addChild(bone16_r1);
		setRotationAngle(bone16_r1, 0.0F, 0.0F, 2.6354F);
		bone16_r1.cubeList.add(new ModelBox(bone16_r1, 18, 0, -6.2424F, -17.4627F, -3.0F, 4, 2, 4, 0.0F, false));

		bone15_r1 = new ModelRenderer(this);
		bone15_r1.setRotationPoint(18.9567F, -22.7218F, 9.4718F);
		bone.addChild(bone15_r1);
		setRotationAngle(bone15_r1, 0.0F, 0.0F, -2.6354F);
		bone15_r1.cubeList.add(new ModelBox(bone15_r1, 18, 15, 5.2424F, -17.4627F, -3.0F, 4, 2, 4, 0.0F, false));

		bone23_r1 = new ModelRenderer(this);
		bone23_r1.setRotationPoint(5.5122F, 4.4902F, 15.1668F);
		bone.addChild(bone23_r1);
		setRotationAngle(bone23_r1, 0.192F, 0.0F, -0.2094F);
		bone23_r1.cubeList.add(new ModelBox(bone23_r1, 41, 6, 4.5F, -29.8908F, -2.4816F, 1, 1, 4, 0.0F, false));

		bone22_r1 = new ModelRenderer(this);
		bone22_r1.setRotationPoint(0.7511F, -17.9137F, 33.572F);
		bone.addChild(bone22_r1);
		setRotationAngle(bone22_r1, 1.3788F, 0.0F, -0.2094F);
		bone22_r1.cubeList.add(new ModelBox(bone22_r1, 7, 26, 4.5F, -27.1816F, -2.1908F, 1, 1, 3, 0.0F, false));

		bone21_r1 = new ModelRenderer(this);
		bone21_r1.setRotationPoint(0.3711F, -19.7015F, -14.7766F);
		bone.addChild(bone21_r1);
		setRotationAngle(bone21_r1, -1.4486F, 0.0F, -0.2094F);
		bone21_r1.cubeList.add(new ModelBox(bone21_r1, 18, 42, 4.49F, -26.2F, -1.0F, 1, 4, 3, 0.0F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(-0.3058F, -20.323F, -14.7766F);
		bone.addChild(bone8_r1);
		setRotationAngle(bone8_r1, -1.4486F, 0.0F, 0.2094F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 26, 42, -2.51F, -26.2F, -1.0F, 1, 4, 3, 0.0F, false));

		bone7_r1 = new ModelRenderer(this);
		bone7_r1.setRotationPoint(-0.6858F, -18.5352F, 33.572F);
		bone.addChild(bone7_r1);
		setRotationAngle(bone7_r1, 1.3788F, 0.0F, 0.2094F);
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 41, 30, -2.5F, -27.1816F, -2.1908F, 1, 1, 3, 0.0F, false));

		bone5_r1 = new ModelRenderer(this);
		bone5_r1.setRotationPoint(-5.4469F, 3.8687F, 15.1668F);
		bone.addChild(bone5_r1);
		setRotationAngle(bone5_r1, 0.192F, 0.0F, 0.2094F);
		bone5_r1.cubeList.add(new ModelBox(bone5_r1, 41, 38, -2.5F, -29.8908F, -2.4816F, 1, 1, 4, 0.0F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(0.0F, 3.3665F, 16.8831F);
		bone.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.2967F, 0.0F, 0.0F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 0, 0, -3.0F, -19.2319F, -8.1577F, 9, 2, 2, 0.0F, false));

		bone18_r1 = new ModelRenderer(this);
		bone18_r1.setRotationPoint(-20.957F, -31.3507F, 9.4718F);
		bone.addChild(bone18_r1);
		setRotationAngle(bone18_r1, 0.0F, 0.0F, 1.8151F);
		bone18_r1.cubeList.add(new ModelBox(bone18_r1, 18, 6, 4.4F, -26.95F, 1.0F, 3, 1, 1, 0.0F, false));

		bone17_r1 = new ModelRenderer(this);
		bone17_r1.setRotationPoint(24.6827F, -28.4398F, 9.4718F);
		bone.addChild(bone17_r1);
		setRotationAngle(bone17_r1, 0.0F, 0.0F, -1.8151F);
		bone17_r1.cubeList.add(new ModelBox(bone17_r1, 19, 31, -4.4F, -26.95F, 1.0F, 3, 1, 1, 0.0F, false));

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(0.0F, 1.8079F, 13.3551F);
		bone.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 0.2443F, 0.0F, 0.0F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 12, 21, -2.71F, -18.2419F, -8.6703F, 1, 2, 6, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 20, 23, 4.71F, -18.2419F, -8.6703F, 1, 2, 6, 0.0F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(1.3941F, -9.6913F, -11.6303F);
		bone.addChild(bone10_r1);
		setRotationAngle(bone10_r1, -1.3968F, 0.1715F, -0.7704F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 16, 49, 2.8066F, -18.2709F, 1.2929F, 1, 5, 1, 0.0F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 20, 49, -2.1432F, -18.2709F, -3.6568F, 1, 5, 1, 0.0F, false));

		sight44_r1 = new ModelRenderer(this);
		sight44_r1.setRotationPoint(0.0F, -7.523F, -11.0912F);
		bone.addChild(sight44_r1);
		setRotationAngle(sight44_r1, -1.3271F, 0.0F, 0.0F);
		sight44_r1.cubeList.add(new ModelBox(sight44_r1, 0, 18, -2.0F, -18.2709F, -4.0118F, 7, 5, 2, 0.0F, false));

		bone13_r1 = new ModelRenderer(this);
		bone13_r1.setRotationPoint(0.0F, -6.7978F, -9.8397F);
		bone.addChild(bone13_r1);
		setRotationAngle(bone13_r1, -1.3788F, 0.0F, 0.0F);
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 28, 25, -2.7F, -18.2184F, -3.1908F, 1, 2, 2, 0.0F, false));
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 47, 5, 4.7F, -18.2184F, -3.1908F, 1, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}