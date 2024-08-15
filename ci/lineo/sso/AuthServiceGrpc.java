package ci.lineo.sso;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "sso.AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.RegisterSchema,
      ci.lineo.sso.AuthProto.TimeoutSchema> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = ci.lineo.sso.AuthProto.RegisterSchema.class,
      responseType = ci.lineo.sso.AuthProto.TimeoutSchema.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.RegisterSchema,
      ci.lineo.sso.AuthProto.TimeoutSchema> getRegisterMethod() {
    io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.RegisterSchema, ci.lineo.sso.AuthProto.TimeoutSchema> getRegisterMethod;
    if ((getRegisterMethod = AuthServiceGrpc.getRegisterMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getRegisterMethod = AuthServiceGrpc.getRegisterMethod) == null) {
          AuthServiceGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<ci.lineo.sso.AuthProto.RegisterSchema, ci.lineo.sso.AuthProto.TimeoutSchema>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.RegisterSchema.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.TimeoutSchema.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("Register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ci.lineo.sso.AuthProto.User> getGetCurrentUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentUser",
      requestType = com.google.protobuf.Empty.class,
      responseType = ci.lineo.sso.AuthProto.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ci.lineo.sso.AuthProto.User> getGetCurrentUserMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, ci.lineo.sso.AuthProto.User> getGetCurrentUserMethod;
    if ((getGetCurrentUserMethod = AuthServiceGrpc.getGetCurrentUserMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetCurrentUserMethod = AuthServiceGrpc.getGetCurrentUserMethod) == null) {
          AuthServiceGrpc.getGetCurrentUserMethod = getGetCurrentUserMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, ci.lineo.sso.AuthProto.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.User.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetCurrentUser"))
              .build();
        }
      }
    }
    return getGetCurrentUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.UpdateUserSchema,
      com.google.protobuf.Empty> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = ci.lineo.sso.AuthProto.UpdateUserSchema.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.UpdateUserSchema,
      com.google.protobuf.Empty> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.UpdateUserSchema, com.google.protobuf.Empty> getUpdateUserMethod;
    if ((getUpdateUserMethod = AuthServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getUpdateUserMethod = AuthServiceGrpc.getUpdateUserMethod) == null) {
          AuthServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<ci.lineo.sso.AuthProto.UpdateUserSchema, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.UpdateUserSchema.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.EmailSchema,
      ci.lineo.sso.AuthProto.TimeoutSchema> getForgotPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ForgotPassword",
      requestType = ci.lineo.sso.AuthProto.EmailSchema.class,
      responseType = ci.lineo.sso.AuthProto.TimeoutSchema.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.EmailSchema,
      ci.lineo.sso.AuthProto.TimeoutSchema> getForgotPasswordMethod() {
    io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.EmailSchema, ci.lineo.sso.AuthProto.TimeoutSchema> getForgotPasswordMethod;
    if ((getForgotPasswordMethod = AuthServiceGrpc.getForgotPasswordMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getForgotPasswordMethod = AuthServiceGrpc.getForgotPasswordMethod) == null) {
          AuthServiceGrpc.getForgotPasswordMethod = getForgotPasswordMethod =
              io.grpc.MethodDescriptor.<ci.lineo.sso.AuthProto.EmailSchema, ci.lineo.sso.AuthProto.TimeoutSchema>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ForgotPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.EmailSchema.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.TimeoutSchema.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ForgotPassword"))
              .build();
        }
      }
    }
    return getForgotPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.EmailCodeSchema,
      ci.lineo.sso.AuthProto.AccessToken> getConfirmResetPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmResetPassword",
      requestType = ci.lineo.sso.AuthProto.EmailCodeSchema.class,
      responseType = ci.lineo.sso.AuthProto.AccessToken.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.EmailCodeSchema,
      ci.lineo.sso.AuthProto.AccessToken> getConfirmResetPasswordMethod() {
    io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.EmailCodeSchema, ci.lineo.sso.AuthProto.AccessToken> getConfirmResetPasswordMethod;
    if ((getConfirmResetPasswordMethod = AuthServiceGrpc.getConfirmResetPasswordMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getConfirmResetPasswordMethod = AuthServiceGrpc.getConfirmResetPasswordMethod) == null) {
          AuthServiceGrpc.getConfirmResetPasswordMethod = getConfirmResetPasswordMethod =
              io.grpc.MethodDescriptor.<ci.lineo.sso.AuthProto.EmailCodeSchema, ci.lineo.sso.AuthProto.AccessToken>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmResetPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.EmailCodeSchema.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.AccessToken.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ConfirmResetPassword"))
              .build();
        }
      }
    }
    return getConfirmResetPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.PasswordSchema,
      com.google.protobuf.Empty> getResetPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetPassword",
      requestType = ci.lineo.sso.AuthProto.PasswordSchema.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.PasswordSchema,
      com.google.protobuf.Empty> getResetPasswordMethod() {
    io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.PasswordSchema, com.google.protobuf.Empty> getResetPasswordMethod;
    if ((getResetPasswordMethod = AuthServiceGrpc.getResetPasswordMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getResetPasswordMethod = AuthServiceGrpc.getResetPasswordMethod) == null) {
          AuthServiceGrpc.getResetPasswordMethod = getResetPasswordMethod =
              io.grpc.MethodDescriptor.<ci.lineo.sso.AuthProto.PasswordSchema, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.PasswordSchema.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ResetPassword"))
              .build();
        }
      }
    }
    return getResetPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.EmailSchema,
      com.google.protobuf.Empty> getCheckEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckEmail",
      requestType = ci.lineo.sso.AuthProto.EmailSchema.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.EmailSchema,
      com.google.protobuf.Empty> getCheckEmailMethod() {
    io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.EmailSchema, com.google.protobuf.Empty> getCheckEmailMethod;
    if ((getCheckEmailMethod = AuthServiceGrpc.getCheckEmailMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getCheckEmailMethod = AuthServiceGrpc.getCheckEmailMethod) == null) {
          AuthServiceGrpc.getCheckEmailMethod = getCheckEmailMethod =
              io.grpc.MethodDescriptor.<ci.lineo.sso.AuthProto.EmailSchema, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.EmailSchema.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("CheckEmail"))
              .build();
        }
      }
    }
    return getCheckEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.EmailCodeSchema,
      com.google.protobuf.Empty> getConfirmEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmEmail",
      requestType = ci.lineo.sso.AuthProto.EmailCodeSchema.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.EmailCodeSchema,
      com.google.protobuf.Empty> getConfirmEmailMethod() {
    io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.EmailCodeSchema, com.google.protobuf.Empty> getConfirmEmailMethod;
    if ((getConfirmEmailMethod = AuthServiceGrpc.getConfirmEmailMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getConfirmEmailMethod = AuthServiceGrpc.getConfirmEmailMethod) == null) {
          AuthServiceGrpc.getConfirmEmailMethod = getConfirmEmailMethod =
              io.grpc.MethodDescriptor.<ci.lineo.sso.AuthProto.EmailCodeSchema, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.EmailCodeSchema.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ConfirmEmail"))
              .build();
        }
      }
    }
    return getConfirmEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.EmailPasswordSchema,
      ci.lineo.sso.AuthProto.AccessToken> getEmailLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EmailLogin",
      requestType = ci.lineo.sso.AuthProto.EmailPasswordSchema.class,
      responseType = ci.lineo.sso.AuthProto.AccessToken.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.EmailPasswordSchema,
      ci.lineo.sso.AuthProto.AccessToken> getEmailLoginMethod() {
    io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.EmailPasswordSchema, ci.lineo.sso.AuthProto.AccessToken> getEmailLoginMethod;
    if ((getEmailLoginMethod = AuthServiceGrpc.getEmailLoginMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getEmailLoginMethod = AuthServiceGrpc.getEmailLoginMethod) == null) {
          AuthServiceGrpc.getEmailLoginMethod = getEmailLoginMethod =
              io.grpc.MethodDescriptor.<ci.lineo.sso.AuthProto.EmailPasswordSchema, ci.lineo.sso.AuthProto.AccessToken>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EmailLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.EmailPasswordSchema.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.AccessToken.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("EmailLogin"))
              .build();
        }
      }
    }
    return getEmailLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.EmailMailSchema,
      ci.lineo.sso.AuthProto.TimeoutSchema> getSendEmailConfirmationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendEmailConfirmation",
      requestType = ci.lineo.sso.AuthProto.EmailMailSchema.class,
      responseType = ci.lineo.sso.AuthProto.TimeoutSchema.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.EmailMailSchema,
      ci.lineo.sso.AuthProto.TimeoutSchema> getSendEmailConfirmationMethod() {
    io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.EmailMailSchema, ci.lineo.sso.AuthProto.TimeoutSchema> getSendEmailConfirmationMethod;
    if ((getSendEmailConfirmationMethod = AuthServiceGrpc.getSendEmailConfirmationMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getSendEmailConfirmationMethod = AuthServiceGrpc.getSendEmailConfirmationMethod) == null) {
          AuthServiceGrpc.getSendEmailConfirmationMethod = getSendEmailConfirmationMethod =
              io.grpc.MethodDescriptor.<ci.lineo.sso.AuthProto.EmailMailSchema, ci.lineo.sso.AuthProto.TimeoutSchema>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEmailConfirmation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.EmailMailSchema.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.TimeoutSchema.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("SendEmailConfirmation"))
              .build();
        }
      }
    }
    return getSendEmailConfirmationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.PhoneCodeSchema,
      ci.lineo.sso.AuthProto.AccessToken> getPhoneLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PhoneLogin",
      requestType = ci.lineo.sso.AuthProto.PhoneCodeSchema.class,
      responseType = ci.lineo.sso.AuthProto.AccessToken.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.PhoneCodeSchema,
      ci.lineo.sso.AuthProto.AccessToken> getPhoneLoginMethod() {
    io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.PhoneCodeSchema, ci.lineo.sso.AuthProto.AccessToken> getPhoneLoginMethod;
    if ((getPhoneLoginMethod = AuthServiceGrpc.getPhoneLoginMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getPhoneLoginMethod = AuthServiceGrpc.getPhoneLoginMethod) == null) {
          AuthServiceGrpc.getPhoneLoginMethod = getPhoneLoginMethod =
              io.grpc.MethodDescriptor.<ci.lineo.sso.AuthProto.PhoneCodeSchema, ci.lineo.sso.AuthProto.AccessToken>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PhoneLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.PhoneCodeSchema.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.AccessToken.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("PhoneLogin"))
              .build();
        }
      }
    }
    return getPhoneLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.PhoneSchema,
      com.google.protobuf.Empty> getCheckPhoneNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckPhoneNumber",
      requestType = ci.lineo.sso.AuthProto.PhoneSchema.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.PhoneSchema,
      com.google.protobuf.Empty> getCheckPhoneNumberMethod() {
    io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.PhoneSchema, com.google.protobuf.Empty> getCheckPhoneNumberMethod;
    if ((getCheckPhoneNumberMethod = AuthServiceGrpc.getCheckPhoneNumberMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getCheckPhoneNumberMethod = AuthServiceGrpc.getCheckPhoneNumberMethod) == null) {
          AuthServiceGrpc.getCheckPhoneNumberMethod = getCheckPhoneNumberMethod =
              io.grpc.MethodDescriptor.<ci.lineo.sso.AuthProto.PhoneSchema, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckPhoneNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.PhoneSchema.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("CheckPhoneNumber"))
              .build();
        }
      }
    }
    return getCheckPhoneNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.PhoneCodeSchema,
      com.google.protobuf.Empty> getConfirmPhoneNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmPhoneNumber",
      requestType = ci.lineo.sso.AuthProto.PhoneCodeSchema.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.PhoneCodeSchema,
      com.google.protobuf.Empty> getConfirmPhoneNumberMethod() {
    io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.PhoneCodeSchema, com.google.protobuf.Empty> getConfirmPhoneNumberMethod;
    if ((getConfirmPhoneNumberMethod = AuthServiceGrpc.getConfirmPhoneNumberMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getConfirmPhoneNumberMethod = AuthServiceGrpc.getConfirmPhoneNumberMethod) == null) {
          AuthServiceGrpc.getConfirmPhoneNumberMethod = getConfirmPhoneNumberMethod =
              io.grpc.MethodDescriptor.<ci.lineo.sso.AuthProto.PhoneCodeSchema, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmPhoneNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.PhoneCodeSchema.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ConfirmPhoneNumber"))
              .build();
        }
      }
    }
    return getConfirmPhoneNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.PhoneSMSSchema,
      ci.lineo.sso.AuthProto.TimeoutSchema> getSendSMSConfirmationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendSMSConfirmation",
      requestType = ci.lineo.sso.AuthProto.PhoneSMSSchema.class,
      responseType = ci.lineo.sso.AuthProto.TimeoutSchema.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.PhoneSMSSchema,
      ci.lineo.sso.AuthProto.TimeoutSchema> getSendSMSConfirmationMethod() {
    io.grpc.MethodDescriptor<ci.lineo.sso.AuthProto.PhoneSMSSchema, ci.lineo.sso.AuthProto.TimeoutSchema> getSendSMSConfirmationMethod;
    if ((getSendSMSConfirmationMethod = AuthServiceGrpc.getSendSMSConfirmationMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getSendSMSConfirmationMethod = AuthServiceGrpc.getSendSMSConfirmationMethod) == null) {
          AuthServiceGrpc.getSendSMSConfirmationMethod = getSendSMSConfirmationMethod =
              io.grpc.MethodDescriptor.<ci.lineo.sso.AuthProto.PhoneSMSSchema, ci.lineo.sso.AuthProto.TimeoutSchema>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendSMSConfirmation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.PhoneSMSSchema.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ci.lineo.sso.AuthProto.TimeoutSchema.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("SendSMSConfirmation"))
              .build();
        }
      }
    }
    return getSendSMSConfirmationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getLogOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LogOut",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getLogOutMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getLogOutMethod;
    if ((getLogOutMethod = AuthServiceGrpc.getLogOutMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getLogOutMethod = AuthServiceGrpc.getLogOutMethod) == null) {
          AuthServiceGrpc.getLogOutMethod = getLogOutMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LogOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("LogOut"))
              .build();
        }
      }
    }
    return getLogOutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getDeactivateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeactivateAccount",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getDeactivateAccountMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getDeactivateAccountMethod;
    if ((getDeactivateAccountMethod = AuthServiceGrpc.getDeactivateAccountMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getDeactivateAccountMethod = AuthServiceGrpc.getDeactivateAccountMethod) == null) {
          AuthServiceGrpc.getDeactivateAccountMethod = getDeactivateAccountMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeactivateAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("DeactivateAccount"))
              .build();
        }
      }
    }
    return getDeactivateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getDeleteAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccount",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getDeleteAccountMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getDeleteAccountMethod;
    if ((getDeleteAccountMethod = AuthServiceGrpc.getDeleteAccountMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getDeleteAccountMethod = AuthServiceGrpc.getDeleteAccountMethod) == null) {
          AuthServiceGrpc.getDeleteAccountMethod = getDeleteAccountMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("DeleteAccount"))
              .build();
        }
      }
    }
    return getDeleteAccountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub>() {
        @java.lang.Override
        public AuthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceStub(channel, callOptions);
        }
      };
    return AuthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub>() {
        @java.lang.Override
        public AuthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub>() {
        @java.lang.Override
        public AuthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceFutureStub(channel, callOptions);
        }
      };
    return AuthServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void register(ci.lineo.sso.AuthProto.RegisterSchema request,
        io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.TimeoutSchema> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    default void getCurrentUser(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentUserMethod(), responseObserver);
    }

    /**
     */
    default void updateUser(ci.lineo.sso.AuthProto.UpdateUserSchema request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    default void forgotPassword(ci.lineo.sso.AuthProto.EmailSchema request,
        io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.TimeoutSchema> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getForgotPasswordMethod(), responseObserver);
    }

    /**
     */
    default void confirmResetPassword(ci.lineo.sso.AuthProto.EmailCodeSchema request,
        io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.AccessToken> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmResetPasswordMethod(), responseObserver);
    }

    /**
     */
    default void resetPassword(ci.lineo.sso.AuthProto.PasswordSchema request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetPasswordMethod(), responseObserver);
    }

    /**
     */
    default void checkEmail(ci.lineo.sso.AuthProto.EmailSchema request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckEmailMethod(), responseObserver);
    }

    /**
     */
    default void confirmEmail(ci.lineo.sso.AuthProto.EmailCodeSchema request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmEmailMethod(), responseObserver);
    }

    /**
     */
    default void emailLogin(ci.lineo.sso.AuthProto.EmailPasswordSchema request,
        io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.AccessToken> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEmailLoginMethod(), responseObserver);
    }

    /**
     */
    default void sendEmailConfirmation(ci.lineo.sso.AuthProto.EmailMailSchema request,
        io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.TimeoutSchema> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendEmailConfirmationMethod(), responseObserver);
    }

    /**
     */
    default void phoneLogin(ci.lineo.sso.AuthProto.PhoneCodeSchema request,
        io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.AccessToken> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPhoneLoginMethod(), responseObserver);
    }

    /**
     */
    default void checkPhoneNumber(ci.lineo.sso.AuthProto.PhoneSchema request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckPhoneNumberMethod(), responseObserver);
    }

    /**
     */
    default void confirmPhoneNumber(ci.lineo.sso.AuthProto.PhoneCodeSchema request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmPhoneNumberMethod(), responseObserver);
    }

    /**
     */
    default void sendSMSConfirmation(ci.lineo.sso.AuthProto.PhoneSMSSchema request,
        io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.TimeoutSchema> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendSMSConfirmationMethod(), responseObserver);
    }

    /**
     */
    default void logOut(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogOutMethod(), responseObserver);
    }

    /**
     */
    default void deactivateAccount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeactivateAccountMethod(), responseObserver);
    }

    /**
     */
    default void deleteAccount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAccountMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AuthService.
   */
  public static abstract class AuthServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuthServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AuthService.
   */
  public static final class AuthServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AuthServiceStub> {
    private AuthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     */
    public void register(ci.lineo.sso.AuthProto.RegisterSchema request,
        io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.TimeoutSchema> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCurrentUser(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(ci.lineo.sso.AuthProto.UpdateUserSchema request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void forgotPassword(ci.lineo.sso.AuthProto.EmailSchema request,
        io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.TimeoutSchema> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getForgotPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void confirmResetPassword(ci.lineo.sso.AuthProto.EmailCodeSchema request,
        io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.AccessToken> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmResetPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetPassword(ci.lineo.sso.AuthProto.PasswordSchema request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkEmail(ci.lineo.sso.AuthProto.EmailSchema request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void confirmEmail(ci.lineo.sso.AuthProto.EmailCodeSchema request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void emailLogin(ci.lineo.sso.AuthProto.EmailPasswordSchema request,
        io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.AccessToken> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEmailLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendEmailConfirmation(ci.lineo.sso.AuthProto.EmailMailSchema request,
        io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.TimeoutSchema> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendEmailConfirmationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void phoneLogin(ci.lineo.sso.AuthProto.PhoneCodeSchema request,
        io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.AccessToken> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPhoneLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkPhoneNumber(ci.lineo.sso.AuthProto.PhoneSchema request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckPhoneNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void confirmPhoneNumber(ci.lineo.sso.AuthProto.PhoneCodeSchema request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmPhoneNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendSMSConfirmation(ci.lineo.sso.AuthProto.PhoneSMSSchema request,
        io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.TimeoutSchema> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendSMSConfirmationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logOut(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogOutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deactivateAccount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeactivateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAccount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AuthService.
   */
  public static final class AuthServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ci.lineo.sso.AuthProto.TimeoutSchema register(ci.lineo.sso.AuthProto.RegisterSchema request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public ci.lineo.sso.AuthProto.User getCurrentUser(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateUser(ci.lineo.sso.AuthProto.UpdateUserSchema request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public ci.lineo.sso.AuthProto.TimeoutSchema forgotPassword(ci.lineo.sso.AuthProto.EmailSchema request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getForgotPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public ci.lineo.sso.AuthProto.AccessToken confirmResetPassword(ci.lineo.sso.AuthProto.EmailCodeSchema request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmResetPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty resetPassword(ci.lineo.sso.AuthProto.PasswordSchema request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty checkEmail(ci.lineo.sso.AuthProto.EmailSchema request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty confirmEmail(ci.lineo.sso.AuthProto.EmailCodeSchema request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public ci.lineo.sso.AuthProto.AccessToken emailLogin(ci.lineo.sso.AuthProto.EmailPasswordSchema request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEmailLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public ci.lineo.sso.AuthProto.TimeoutSchema sendEmailConfirmation(ci.lineo.sso.AuthProto.EmailMailSchema request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendEmailConfirmationMethod(), getCallOptions(), request);
    }

    /**
     */
    public ci.lineo.sso.AuthProto.AccessToken phoneLogin(ci.lineo.sso.AuthProto.PhoneCodeSchema request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPhoneLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty checkPhoneNumber(ci.lineo.sso.AuthProto.PhoneSchema request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckPhoneNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty confirmPhoneNumber(ci.lineo.sso.AuthProto.PhoneCodeSchema request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmPhoneNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public ci.lineo.sso.AuthProto.TimeoutSchema sendSMSConfirmation(ci.lineo.sso.AuthProto.PhoneSMSSchema request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendSMSConfirmationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty logOut(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogOutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deactivateAccount(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeactivateAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteAccount(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAccountMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AuthService.
   */
  public static final class AuthServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ci.lineo.sso.AuthProto.TimeoutSchema> register(
        ci.lineo.sso.AuthProto.RegisterSchema request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ci.lineo.sso.AuthProto.User> getCurrentUser(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateUser(
        ci.lineo.sso.AuthProto.UpdateUserSchema request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ci.lineo.sso.AuthProto.TimeoutSchema> forgotPassword(
        ci.lineo.sso.AuthProto.EmailSchema request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getForgotPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ci.lineo.sso.AuthProto.AccessToken> confirmResetPassword(
        ci.lineo.sso.AuthProto.EmailCodeSchema request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmResetPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> resetPassword(
        ci.lineo.sso.AuthProto.PasswordSchema request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> checkEmail(
        ci.lineo.sso.AuthProto.EmailSchema request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> confirmEmail(
        ci.lineo.sso.AuthProto.EmailCodeSchema request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ci.lineo.sso.AuthProto.AccessToken> emailLogin(
        ci.lineo.sso.AuthProto.EmailPasswordSchema request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEmailLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ci.lineo.sso.AuthProto.TimeoutSchema> sendEmailConfirmation(
        ci.lineo.sso.AuthProto.EmailMailSchema request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendEmailConfirmationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ci.lineo.sso.AuthProto.AccessToken> phoneLogin(
        ci.lineo.sso.AuthProto.PhoneCodeSchema request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPhoneLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> checkPhoneNumber(
        ci.lineo.sso.AuthProto.PhoneSchema request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckPhoneNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> confirmPhoneNumber(
        ci.lineo.sso.AuthProto.PhoneCodeSchema request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmPhoneNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ci.lineo.sso.AuthProto.TimeoutSchema> sendSMSConfirmation(
        ci.lineo.sso.AuthProto.PhoneSMSSchema request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendSMSConfirmationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> logOut(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogOutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deactivateAccount(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeactivateAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAccount(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_GET_CURRENT_USER = 1;
  private static final int METHODID_UPDATE_USER = 2;
  private static final int METHODID_FORGOT_PASSWORD = 3;
  private static final int METHODID_CONFIRM_RESET_PASSWORD = 4;
  private static final int METHODID_RESET_PASSWORD = 5;
  private static final int METHODID_CHECK_EMAIL = 6;
  private static final int METHODID_CONFIRM_EMAIL = 7;
  private static final int METHODID_EMAIL_LOGIN = 8;
  private static final int METHODID_SEND_EMAIL_CONFIRMATION = 9;
  private static final int METHODID_PHONE_LOGIN = 10;
  private static final int METHODID_CHECK_PHONE_NUMBER = 11;
  private static final int METHODID_CONFIRM_PHONE_NUMBER = 12;
  private static final int METHODID_SEND_SMSCONFIRMATION = 13;
  private static final int METHODID_LOG_OUT = 14;
  private static final int METHODID_DEACTIVATE_ACCOUNT = 15;
  private static final int METHODID_DELETE_ACCOUNT = 16;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((ci.lineo.sso.AuthProto.RegisterSchema) request,
              (io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.TimeoutSchema>) responseObserver);
          break;
        case METHODID_GET_CURRENT_USER:
          serviceImpl.getCurrentUser((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.User>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((ci.lineo.sso.AuthProto.UpdateUserSchema) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_FORGOT_PASSWORD:
          serviceImpl.forgotPassword((ci.lineo.sso.AuthProto.EmailSchema) request,
              (io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.TimeoutSchema>) responseObserver);
          break;
        case METHODID_CONFIRM_RESET_PASSWORD:
          serviceImpl.confirmResetPassword((ci.lineo.sso.AuthProto.EmailCodeSchema) request,
              (io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.AccessToken>) responseObserver);
          break;
        case METHODID_RESET_PASSWORD:
          serviceImpl.resetPassword((ci.lineo.sso.AuthProto.PasswordSchema) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CHECK_EMAIL:
          serviceImpl.checkEmail((ci.lineo.sso.AuthProto.EmailSchema) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CONFIRM_EMAIL:
          serviceImpl.confirmEmail((ci.lineo.sso.AuthProto.EmailCodeSchema) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_EMAIL_LOGIN:
          serviceImpl.emailLogin((ci.lineo.sso.AuthProto.EmailPasswordSchema) request,
              (io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.AccessToken>) responseObserver);
          break;
        case METHODID_SEND_EMAIL_CONFIRMATION:
          serviceImpl.sendEmailConfirmation((ci.lineo.sso.AuthProto.EmailMailSchema) request,
              (io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.TimeoutSchema>) responseObserver);
          break;
        case METHODID_PHONE_LOGIN:
          serviceImpl.phoneLogin((ci.lineo.sso.AuthProto.PhoneCodeSchema) request,
              (io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.AccessToken>) responseObserver);
          break;
        case METHODID_CHECK_PHONE_NUMBER:
          serviceImpl.checkPhoneNumber((ci.lineo.sso.AuthProto.PhoneSchema) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CONFIRM_PHONE_NUMBER:
          serviceImpl.confirmPhoneNumber((ci.lineo.sso.AuthProto.PhoneCodeSchema) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SEND_SMSCONFIRMATION:
          serviceImpl.sendSMSConfirmation((ci.lineo.sso.AuthProto.PhoneSMSSchema) request,
              (io.grpc.stub.StreamObserver<ci.lineo.sso.AuthProto.TimeoutSchema>) responseObserver);
          break;
        case METHODID_LOG_OUT:
          serviceImpl.logOut((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DEACTIVATE_ACCOUNT:
          serviceImpl.deactivateAccount((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_ACCOUNT:
          serviceImpl.deleteAccount((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRegisterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ci.lineo.sso.AuthProto.RegisterSchema,
              ci.lineo.sso.AuthProto.TimeoutSchema>(
                service, METHODID_REGISTER)))
        .addMethod(
          getGetCurrentUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              ci.lineo.sso.AuthProto.User>(
                service, METHODID_GET_CURRENT_USER)))
        .addMethod(
          getUpdateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ci.lineo.sso.AuthProto.UpdateUserSchema,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_USER)))
        .addMethod(
          getForgotPasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ci.lineo.sso.AuthProto.EmailSchema,
              ci.lineo.sso.AuthProto.TimeoutSchema>(
                service, METHODID_FORGOT_PASSWORD)))
        .addMethod(
          getConfirmResetPasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ci.lineo.sso.AuthProto.EmailCodeSchema,
              ci.lineo.sso.AuthProto.AccessToken>(
                service, METHODID_CONFIRM_RESET_PASSWORD)))
        .addMethod(
          getResetPasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ci.lineo.sso.AuthProto.PasswordSchema,
              com.google.protobuf.Empty>(
                service, METHODID_RESET_PASSWORD)))
        .addMethod(
          getCheckEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ci.lineo.sso.AuthProto.EmailSchema,
              com.google.protobuf.Empty>(
                service, METHODID_CHECK_EMAIL)))
        .addMethod(
          getConfirmEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ci.lineo.sso.AuthProto.EmailCodeSchema,
              com.google.protobuf.Empty>(
                service, METHODID_CONFIRM_EMAIL)))
        .addMethod(
          getEmailLoginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ci.lineo.sso.AuthProto.EmailPasswordSchema,
              ci.lineo.sso.AuthProto.AccessToken>(
                service, METHODID_EMAIL_LOGIN)))
        .addMethod(
          getSendEmailConfirmationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ci.lineo.sso.AuthProto.EmailMailSchema,
              ci.lineo.sso.AuthProto.TimeoutSchema>(
                service, METHODID_SEND_EMAIL_CONFIRMATION)))
        .addMethod(
          getPhoneLoginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ci.lineo.sso.AuthProto.PhoneCodeSchema,
              ci.lineo.sso.AuthProto.AccessToken>(
                service, METHODID_PHONE_LOGIN)))
        .addMethod(
          getCheckPhoneNumberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ci.lineo.sso.AuthProto.PhoneSchema,
              com.google.protobuf.Empty>(
                service, METHODID_CHECK_PHONE_NUMBER)))
        .addMethod(
          getConfirmPhoneNumberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ci.lineo.sso.AuthProto.PhoneCodeSchema,
              com.google.protobuf.Empty>(
                service, METHODID_CONFIRM_PHONE_NUMBER)))
        .addMethod(
          getSendSMSConfirmationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ci.lineo.sso.AuthProto.PhoneSMSSchema,
              ci.lineo.sso.AuthProto.TimeoutSchema>(
                service, METHODID_SEND_SMSCONFIRMATION)))
        .addMethod(
          getLogOutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_LOG_OUT)))
        .addMethod(
          getDeactivateAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_DEACTIVATE_ACCOUNT)))
        .addMethod(
          getDeleteAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_ACCOUNT)))
        .build();
  }

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ci.lineo.sso.AuthProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AuthServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getGetCurrentUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getForgotPasswordMethod())
              .addMethod(getConfirmResetPasswordMethod())
              .addMethod(getResetPasswordMethod())
              .addMethod(getCheckEmailMethod())
              .addMethod(getConfirmEmailMethod())
              .addMethod(getEmailLoginMethod())
              .addMethod(getSendEmailConfirmationMethod())
              .addMethod(getPhoneLoginMethod())
              .addMethod(getCheckPhoneNumberMethod())
              .addMethod(getConfirmPhoneNumberMethod())
              .addMethod(getSendSMSConfirmationMethod())
              .addMethod(getLogOutMethod())
              .addMethod(getDeactivateAccountMethod())
              .addMethod(getDeleteAccountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
