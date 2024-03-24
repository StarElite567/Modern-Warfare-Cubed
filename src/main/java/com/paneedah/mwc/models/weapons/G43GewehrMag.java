package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
public class G43GewehrMag extends ModelWithAttachments {
	private final ModelRenderer mag;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;

	public G43GewehrMag() {
		textureWidth = 280;
		textureHeight = 280;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(-2.25F, -76.4722F, -35.1616F);
		mag.cubeList.add(new ModelBox(mag, 111, 64, -0.7348F, 67.543F, 9.2986F, 3, 2, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.5F, 67.0F, 0.0F);
		mag.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0807F, -0.0334F, -0.3914F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 106, 123, 0.2748F, -0.179F, 1.0F, 1, 1, 2, -0.3F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 67.0F, 0.0F);
		mag.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0807F, 0.0334F, 0.3914F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 122, 123, -1.2748F, -0.179F, 1.0F, 1, 1, 2, -0.3F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.6F, 73.4722F, 6.7616F);
		mag.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 126, 36, -0.5F, -5.75F, -8.0F, 1, 1, 11, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 127, 68, -0.75F, 1.0F, -7.0F, 2, 1, 1, 0.0F, true));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 65, 98, -0.75F, -5.0F, -6.0F, 2, 7, 1, 0.0F, true));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 51, 18, -0.75F, -5.0F, 0.0F, 2, 7, 3, 0.0F, true));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 101, 15, -0.7656F, -5.0F, -1.7F, 2, 7, 1, 0.0F, true));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 102, 25, -0.75F, -5.0F, -2.0F, 2, 7, 1, 0.0F, true));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 102, 34, -0.7656F, -5.0F, -3.55F, 2, 7, 1, 0.0F, true));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 68, 106, -0.75F, -5.0F, -3.85F, 2, 7, 1, 0.0F, true));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 109, 77, -0.75F, -5.0F, -8.0156F, 2, 7, 1, 0.0F, true));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 86, 151, 2.2F, -5.75F, -8.0F, 1, 1, 11, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 127, 68, 1.45F, 1.0F, -7.0F, 2, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 65, 98, 1.45F, -5.0F, -6.0F, 2, 7, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 35, 91, -0.4F, 1.0F, -8.3F, 4, 1, 11, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 51, 18, 1.45F, -5.0F, 0.0F, 2, 7, 3, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 101, 15, 1.4656F, -5.0F, -1.7F, 2, 7, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 102, 25, 1.45F, -5.0F, -2.0F, 2, 7, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 102, 34, 1.4656F, -5.0F, -3.55F, 2, 7, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 68, 106, 1.45F, -5.0F, -3.85F, 2, 7, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 109, 77, 1.45F, -5.0F, -8.0156F, 2, 7, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.6429F, 68.2297F, 4.2088F);
		mag.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0618F, 0.0617F, 0.7835F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 49, 116, -0.5F, -0.5F, 3.0F, 1, 1, 3, 0.0F, true));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 43, 82, -0.5F, -0.5F, -0.85F, 1, 1, 1, 0.0F, true));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 83, -0.5F, -0.5F, 1.0F, 1, 1, 1, 0.0F, true));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 83, 15, -0.5F, -0.5F, -3.0F, 1, 1, 1, 0.0F, true));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 83, 21, -0.5F, -0.4981F, -4.0436F, 1, 1, 1, 0.0F, true));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 51, 83, -0.5F, -0.5F, -5.0F, 1, 1, 1, 0.0F, true));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.6585F, 68.2297F, 4.2088F);
		mag.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0618F, 0.0617F, 0.7835F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 35, 82, -0.5F, -0.5F, 1.3F, 1, 1, 1, 0.0F, true));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 76, 82, -0.5F, -0.5F, -0.55F, 1, 1, 1, 0.0F, true));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.45F, 69.2524F, 1.8081F);
		mag.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.8727F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 122, 126, -0.9844F, 0.4F, -0.5F, 2, 1, 1, -0.1F, true));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 122, 126, 1.3844F, 0.4F, -0.5F, 2, 1, 1, -0.1F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.45F, 69.1538F, 0.6811F);
		mag.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.8727F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 126, 123, -0.9844F, 0.4F, -0.5F, 2, 1, 1, -0.1F, true));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 126, 123, 1.3844F, 0.4F, -0.5F, 2, 1, 1, -0.1F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.45F, 73.5024F, 1.4699F);
		mag.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.8727F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 127, -0.9844F, 0.4F, -0.5F, 2, 1, 1, -0.1F, true));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 127, 1.3844F, 0.4F, -0.5F, 2, 1, 1, -0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.45F, 73.4038F, 0.3428F);
		mag.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.8727F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 127, -0.9844F, 0.4F, -0.5F, 2, 1, 1, -0.1F, true));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 127, 1.3844F, 0.4F, -0.5F, 2, 1, 1, -0.1F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.35F, 72.9722F, 6.7616F);
		mag.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 125, 71, -1.0F, -4.5F, -7.0F, 2, 2, 1, 0.0F, true));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 125, 71, 1.2F, -4.5F, -7.0F, 2, 2, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 73.6615F, 4.3359F);
		mag.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 76, 68, -2.0F, 1.0F, 1.0F, 2, 1, 4, -0.4F, true));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 82, -2.0F, 1.0F, -3.0F, 2, 1, 4, -0.4F, true));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 76, 68, 1.5F, 1.0F, 1.0F, 2, 1, 4, -0.4F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 82, 1.5F, 1.0F, -3.0F, 2, 1, 4, -0.4F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(2.1429F, 68.2297F, 4.2088F);
		mag.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.0618F, -0.0617F, -0.7835F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 49, 116, -0.5F, -0.5F, 3.0F, 1, 1, 3, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 43, 82, -0.5F, -0.5F, -0.85F, 1, 1, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 83, -0.5F, -0.5F, 1.0F, 1, 1, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 83, 15, -0.5F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 83, 21, -0.5F, -0.4981F, -4.0436F, 1, 1, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 51, 83, -0.5F, -0.5F, -5.0F, 1, 1, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(2.1585F, 68.2297F, 4.2088F);
		mag.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.0618F, -0.0617F, -0.7835F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 35, 82, -0.5F, -0.5F, 1.3F, 1, 1, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 76, 82, -0.5F, -0.5F, -0.55F, 1, 1, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.2F, 69.8411F, -1.0683F);
		mag.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.3054F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 126, 110, -0.5F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.7F, 73.2222F, 6.2616F);
		mag.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.0873F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 35, 124, -1.0F, -5.0F, -8.25F, 2, 2, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-0.1F, 72.1086F, 8.8867F);
		mag.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.1231F, -0.7816F, 0.0869F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 104, 42, -0.25F, -3.5F, 0.25F, 1, 7, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(1.6F, 72.1086F, 8.8867F);
		mag.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.1231F, 0.7816F, -0.0869F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 104, 50, -0.75F, -3.5F, 0.25F, 1, 7, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-0.2461F, 67.9211F, 8.9538F);
		mag.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.0807F, 0.0334F, 0.3914F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 15, -1.0F, -0.5F, -5.5F, 1, 1, 7, -0.2F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(1.8385F, 67.883F, 8.9571F);
		mag.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.0807F, -0.0334F, -0.3914F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 17, 4, -0.1F, -0.5F, -5.5F, 1, 1, 7, -0.2F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.35F, 72.7722F, 6.7616F);
		mag.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 127, -1.0F, 2.1F, -7.3F, 3, 1, 10, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(1.9536F, 73.4647F, 7.1762F);
		mag.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.0873F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 51, 53, -1.0F, -5.0F, 0.0F, 1, 7, 3, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(1.6F, 73.4722F, 7.2616F);
		mag.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.0873F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 110, -1.0F, -5.0F, -8.0F, 2, 7, 10, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 76, 15, -2.0F, -5.0F, -8.0F, 2, 7, 11, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.1F, 73.7222F, 7.5116F);
		mag.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.0873F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 16, 15, 0.0F, -5.0F, 2.0F, 1, 6, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}